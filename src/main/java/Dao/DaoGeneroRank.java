
package Dao;

import classes.ConnectionFactory;
import classes.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DaoGeneroRank implements Comparable<DaoGeneroRank>{
    private String nomeMusica;
    private String nomeGenero;
    private String loginPessoa;
    private double vlAvaliacao;
    
    public DaoGeneroRank() {
    }
    
    public DaoGeneroRank(String nomeGenero, double vlAvaliacao) {
        this.nomeGenero = nomeGenero;
        this.vlAvaliacao = vlAvaliacao;
    }

    public DaoGeneroRank(String nomeMusica, String nomeGenero, String loginPessoa, double vlAvaliacao) {
        this.nomeMusica = nomeMusica;
        this.nomeGenero = nomeGenero;
        this.loginPessoa = loginPessoa;
        this.vlAvaliacao = vlAvaliacao;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public String getLoginPessoa() {
        return loginPessoa;
    }

    public void setLoginPessoa(String loginPessoa) {
        this.loginPessoa = loginPessoa;
    }

    public double getVlAvaliacao() {
        return vlAvaliacao;
    }

    public void setVlAvaliacao(double vlAvaliacao) {
        this.vlAvaliacao = vlAvaliacao;
    }
    
    public List<DaoGeneroRank> ListarGenero(String login) {
        List<DaoGeneroRank> generoRank = new ArrayList<>();
        List<Genero> listaGenero = new ArrayList<>();
        List<DaoGeneroRank> generoAvaliacao = new ArrayList<>();
        //1 Definir o comando SQL
        String sqlgenero = 
                "SELECT tb_genero.nomeGenero FROM tb_pessoaGenero "
                + "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero "
                + "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa "
                + "WHERE tb_pessoa.loginPessoa = ?;";
        
            try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            PreparedStatement ps1 = conexao.prepareStatement(sqlgenero);
            ps1.setString(1, login);
            ResultSet rs1 = ps1.executeQuery();
              while (rs1.next()) {
                String nomeGenero = rs1.getString("nomeGenero");
                Genero g = new Genero(nomeGenero);
                listaGenero.add(g);
            }          
            
        String sqllista =
                "SELECT tb_musica.nomeMusica, tb_genero.nomeGenero, tb_pessoa.loginPessoa, tb_avaliacao.valorAvaliacao "
                + "FROM tb_avaliacao INNER JOIN tb_musicaGenero ON tb_musicaGenero.codigoMusica = tb_avaliacao.codigoMusica "
                + "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica "
                + "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero "
                + "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente "
                + "WHERE tb_pessoa.loginPessoa = ?;";
            PreparedStatement ps2 = conexao.prepareStatement(sqllista);
            ps2.setString(1, login);
            ResultSet rs2 = ps2.executeQuery();

            while (rs2.next()) {
                String Musica= rs2.getString("nomeMusica");
                String Genero = rs2.getString("nomeGenero");
                String Pessoa = rs2.getString("loginPessoa");
                double Avaliacao = rs2.getDouble("valorAvaliacao");
                DaoGeneroRank dgr = new DaoGeneroRank(Musica, Genero, Pessoa, Avaliacao);
                generoAvaliacao.add(dgr);
            }
            conexao.close();
            
            for(Genero g: listaGenero){
            int contgen = 0, generoSoma = 0;
            double mediagen = 0;
                for(DaoGeneroRank dgr : generoAvaliacao){
                    if(g.getNomeGenero().equals(dgr.getNomeGenero())){
                        contgen += 1;
                        generoSoma += dgr.getVlAvaliacao();
                    }
                }
                    if(contgen == 0){
                        mediagen = 0;
                    }else{
                        mediagen = generoSoma / contgen;
                    }
                    DaoGeneroRank generoMedia = new DaoGeneroRank(g.getNomeGenero(), mediagen);
                    
                    generoRank.add(generoMedia);
            }

            Collections.sort(generoRank);
            
            
            return generoRank;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return generoRank;
    }
    
     /*SELECT tb_genero.nomeGenero FROM tb_pessoaGenero //consultar os generos 
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa 
WHERE tb_pessoa.loginPessoa = 'jorgelpiva';*/
        
        /* SELECT tb_musica.nomeMusica, tb_genero.nomeGenero, tb_pessoa.loginPessoa,
tb_avaliacao.valorAvaliacao FROM tb_avaliacao
INNER JOIN tb_musicaGenero ON tb_musicaGenero.codigoMusica = tb_avaliacao.codigoMusica
INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente 
WHERE tb_pessoa.loginPessoa = 'mbanzato';*/

    @Override
    public String toString() {
        return "DaoGeneroRank{" + "nomeMusica=" + nomeMusica + ", nomeGenero=" + nomeGenero + ", loginPessoa=" + loginPessoa + ", vlAvaliacao=" + vlAvaliacao + '}';
    }

    @Override
    public int compareTo(DaoGeneroRank t) {
        if(this.vlAvaliacao > t.getVlAvaliacao()){
            return -1;
        }else if(this.vlAvaliacao < t.getVlAvaliacao()){
            return 1;
        }
        return 0;
    }

    
}
