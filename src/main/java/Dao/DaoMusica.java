package Dao;

import classes.ConnectionFactory;
import classes.Musica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoMusica {
    
     public static void alterarNomeOuCompositor(String musica, String compositor, int codigo){
         
        String sql = "UPDATE tb_musica SET tb_musica.nomeMusica = ?, tb_musica.compositorMusica = ?\n " +
                     "WHERE tb_musica.codigoMusica = ?;";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, musica);
             ps.setString(2, compositor);
             ps.setInt(3, codigo);
             ps.execute();
             
             conexao.close();
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
     }
    
    public static List<Musica> listarMusicas (){
     List<Musica> musicas = new ArrayList<>();
         String nomeMusica;
         String nomeCompositor;
         String sql = "SELECT * FROM tb_musica";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()){
                 nomeMusica = rs.getString("nomeMusica");
                 nomeCompositor = rs.getString("compositorMusica");
                 Musica m = new Musica(nomeMusica, nomeCompositor);
                 musicas.add(m);
             }
             conexao.close();
             
             return musicas; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
         return musicas;                
     }
    
    public static boolean verifDuplicidade(String musica, String compositor){
         boolean status;
         String sql = "SELECT * FROM tb_musica WHERE nomeMusica = ? AND compositorMusica = ?";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, musica);
             ps.setString(2, compositor);
             ResultSet rs = ps.executeQuery();
             
             status = rs.next();
             conexao.close();
             return status; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
        return false;
                  
     }
    
    public static boolean verifSeAvaliada(String musica, String compositor){
         boolean status;
         String sql = "SELECT tb_musica.codigoMusica FROM tb_avaliacao \n" +
                      "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica \n" +
                      "WHERE tb_musica.nomeMusica = ? AND tb_musica.compositorMusica = ? ;";
         
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, musica);
             ps.setString(2, compositor);
             ResultSet rs = ps.executeQuery();
             
             status = rs.next();
             conexao.close();
             return status; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
        return false;
                  
     }
    
     public static void incluirMusicaTbMusica(String musica, String compositor){
         
        String sql = "INSERT INTO tb_musica(nomeMusica, compositorMusica) VALUES (?, ?);";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, musica);
             ps.setString(2, compositor);
             ps.execute();
             
             conexao.close();
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
     }
     
     public static void incluirMusicaTbMusicaGenero(int musica, int genero){
         
        String sql = "INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (?,?);";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setInt(1, musica);
             ps.setInt(2, genero);
             ps.execute();
             
             conexao.close();
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
     }
     
     public static int codigoMusica(String nomeMusica, String compositorMusica){
         int codigoGenero = 0;
         
         String sql = "SELECT tb_musica.codigoMusica FROM tb_musica where nomeMusica = ? and compositorMusica = ?";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, nomeMusica);
             ps.setString(2, compositorMusica);
             ResultSet rs = ps.executeQuery();
             
             if(rs.next()){
                 codigoGenero = rs.getInt("codigoMusica");
             }
             conexao.close();
             return codigoGenero;
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return codigoGenero;         
     }
     
     public static void excluirMusicaGenero(String nomeMusica, String compositorMusica){
        
        int codigoMusica = DaoMusica.codigoMusica(nomeMusica, compositorMusica);
    
        String sql = "DELETE FROM tb_musicaGenero WHERE codigoMusica = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigoMusica);
            ps.execute();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();            
        }       
    } 
     
     public static void excluirMusica(String nomeMusica, String compositorMusica){
        
        int codigoMusica = DaoMusica.codigoMusica(nomeMusica, compositorMusica);
    
        String sql = "DELETE FROM tb_musica WHERE codigoMusica = ? AND tb_musica.compositorMusica = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigoMusica);
            ps.setString(2, compositorMusica);
            ps.execute();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();            
        }       
    } 
     
     public static void excluirGeneroDeMusica(int codMusica, int codGenero){
         
        String sql = "DELETE FROM tb_musicaGenero WHERE codigoMusica = ? AND codigoGenero = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codMusica);
            ps.setInt(2, codGenero);
            ps.execute();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();            
        }       
    } 
     
     
    
}
