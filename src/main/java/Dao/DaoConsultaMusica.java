package Dao;

import classes.ConnectionFactory;
import classes.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import classes.Musica;

public class DaoConsultaMusica {
    
    public static String listarGenero(String login){
        String sqlgeneros = "";
        List<Genero> generos = new ArrayList();
        
        String sql = "SELECT tb_genero.nomeGenero FROM tb_pessoaGenero\n" +
                    "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa\n" +
                    "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero\n" +
                    "WHERE tb_pessoa.loginPessoa = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Genero g = new Genero(rs.getString("nomeGenero"));
                generos.add(g);
            }
            
            conexao.close();
            
            for(int i = 0; i < generos.size(); i++){
                if(i != 0){
                    sqlgeneros += " OR tb_genero.nomeGenero = ";
                } 
                sqlgeneros += "'"+generos.get(i).getNomeGenero()+"'";
            }           
        return sqlgeneros;  
            

        } catch (Exception e) {
            e.printStackTrace();            
        } 
        return sqlgeneros;  
    }
    
    public static List<Musica> listMusicaCliente(String stringsql){
        List<Musica> musicas = new ArrayList<>();
        
        
     String sql = "SELECT DISTINCT tb_musica.nomeMusica, tb_musica.compositorMusica FROM tb_musicaGenero "+
                  "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica "+
                  "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero "+
                  "WHERE tb_genero.nomeGenero = "+stringsql+";";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Musica m = new Musica(rs.getString("nomeMusica"), rs.getString("compositorMusica"));
                musicas.add(m);
            }
            
            conexao.close();          
            
        return musicas;  

        } catch (Exception e) {
            e.printStackTrace();            
        } 
        return musicas;  
    }
 
    public static List<String> listarAvaliacoes(String login){
        String sqlgeneros = "";
        List<String> avaliadas = new ArrayList<>();
        
        String sql = "SELECT tb_musica.nomeMusica FROM tb_avaliacao\n" +
                     "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente\n" +
                     "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica\n" +
                     "WHERE tb_pessoa.loginPessoa = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                avaliadas.add(rs.getString("nomeMusica"));
            }
            
            conexao.close();
                      
        return avaliadas;  
            

        } catch (Exception e) {
            e.printStackTrace();            
        } 
        return avaliadas;  
    }
}

    
    
