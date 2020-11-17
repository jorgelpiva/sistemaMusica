/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class DaoAvaliar {
    
    private String nomeMusica;
    private String compositorMusica;
    private int valorAvaliacao;
    
    public DaoAvaliar(){
        
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getCompositorMusica() {
        return compositorMusica;
    }

    public void setCompositorMusica(String compositorMusica) {
        this.compositorMusica = compositorMusica;
    }

    public int getValorAvaliacao() {
        return valorAvaliacao;
    }

    public void setValorAvaliacao(int valorAvaliacao) {
        this.valorAvaliacao = valorAvaliacao;
    }
    
    public DaoAvaliar(String nomeMusica, String compositorMusica, int valorAvaliacao){
        this.nomeMusica = nomeMusica;
        this.compositorMusica = compositorMusica;
        this.valorAvaliacao = valorAvaliacao;    
    }
    
    public List<DaoAvaliar> listarNaoAvaliado(String login){
        List<DaoAvaliar> paraAvaliar = new ArrayList<>();
        
        String sqlPAvaliar = "SELECT DISTINCT tb_musica.compositorMusica, "
                + "tb_musica.nomeMusica, tb_avaliacao.valorAvaliacao " 
                + "FROM tb_musica "
                + "INNER JOIN tb_musicaGenero ON tb_musicaGenero.codigoMusica = tb_musica.codigoMusica "
                + "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero "
                + "INNER JOIN tb_pessoaGenero ON tb_pessoaGenero.codigoGenero = tb_musicaGenero.codigoGenero "
                + "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa "
                + "LEFT JOIN tb_avaliacao ON tb_avaliacao.codigoMusica = tb_musica.codigoMusica "
                + "WHERE tb_pessoa.loginPessoa = ? AND isnull(tb_avaliacao.valorAvaliacao);";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sqlPAvaliar);
            //4. substituir os placeholders
            ps.setString(1, login);
            //4. Executar
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                String musica = rs.getString("nomeMusica");
                String compositor = rs.getString("compositorMusica");
                int avaliacao = 0;
                
                DaoAvaliar av = new DaoAvaliar(musica, compositor, avaliacao);
                paraAvaliar.add(av);       
            }
            
            
            conexao.close();
            return paraAvaliar;

            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return paraAvaliar;
    }
    
    
}
