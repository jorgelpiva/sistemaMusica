/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import classes.ConnectionFactory;
import classes.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class DaoGenero {
    
    public static void excluirGeneroPref(String login, String genero){
        
        int codigoPessoa = 0, codigoGenero = 0;
        String sqlS = "SELECT tb_pessoa.codigoPessoa, tb_genero.codigoGenero FROM tb_pessoaGenero "
                + "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa "
                + "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero "
                + "WHERE tb_pessoa.loginPessoa = ? and tb_genero.nomeGenero = ?;";
        
        String sqlD = "DELETE FROM tb_pessoaGenero WHERE codigoPessoa = ? AND codigoGenero = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement psS = conexao.prepareStatement(sqlS);
            psS.setString(1, login);
            psS.setString(2, genero);
            ResultSet rsS = psS.executeQuery();
            
            if (rsS.next()){
                codigoPessoa = rsS.getInt("codigoPessoa");
                codigoGenero = rsS.getInt("codigoGenero");
            }
            
            
            PreparedStatement psD = conexao.prepareStatement(sqlD);
            psD.setInt(1, codigoPessoa);
            psD.setInt(2, codigoGenero);
            psD.execute();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();            
        }       
    }    
    
    public static void excluirGenero(String genero){
        
        int codigoGenero = DaoGenero.codigoGenero(genero);
    
        String sql = "DELETE FROM tb_genero WHERE codigoGenero = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigoGenero);
            ps.execute();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();            
        }       
    }    
    
     public static boolean consultaGeneroCadastrado(String login, String genero){
        
        int codigoPessoa = 0, codigoGenero = 0;
        String sql = "SELECT tb_genero.nomeGenero FROM tb_pessoaGenero\n" +
                       "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa \n" +
                       "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero \n" +
                       "WHERE tb_pessoa.loginPessoa = ? AND tb_genero.nomeGenero = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, genero);
            ResultSet rs = ps.executeQuery();
            
      
            boolean bool = rs.next();
            conexao.close();
            return bool;

        } catch (Exception e) {
            e.printStackTrace();            
        }       
        return false;
    }    
     
      public static boolean haGeneroMusica(String musica, String genero){
        
        int codigoPessoa = 0, codigoGenero = 0;
        String sql = "SELECT tb_genero.codigoGenero FROM tb_musicaGenero \n" +
                     "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero \n" +
                     "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica \n" +
                     "WHERE tb_musica.nomeMusica = ? "+
                     "AND tb_genero.nomeGenero = ? ;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, musica);
            ps.setString(2, genero);
            ResultSet rs = ps.executeQuery();
            
      
            boolean bool = rs.next();
            conexao.close();
            return bool;

        } catch (Exception e) {
            e.printStackTrace();            
        }       
        return false;
    }  
     
     public static boolean haGenero(String login){
        
        int codigoPessoa = 0, codigoGenero = 0;
        String sql = "SELECT tb_genero.nomeGenero FROM tb_pessoaGenero\n" +
                       "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa \n" +
                       "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero \n" +
                       "WHERE tb_pessoa.loginPessoa = ? ;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            
      
            boolean bool = rs.next();
            conexao.close();
            return bool;

        } catch (Exception e) {
            e.printStackTrace();            
        }       
        return false;
    }    
     
     public static void incluirGenero(String genero){
         
        String sql = "INSERT INTO tb_genero(nomeGenero) VALUES (?);";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, genero);
             ps.execute();
             
             conexao.close();
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
     }
     
     public static int codigoGenero(String nomeGenero){
         int codigoGenero = 0;
         
         String sql = "SELECT tb_genero.codigoGenero FROM tb_genero where nomeGenero = ?";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, nomeGenero);
             ResultSet rs = ps.executeQuery();
             
             if(rs.next()){
                 codigoGenero = rs.getInt("codigoGenero");
             }
             conexao.close();
             return codigoGenero;
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return codigoGenero;         
     }
     
      public static void alterarGenero(String nomeAtual, String nomeNovo){
          
        int codigoGenero = codigoGenero(nomeAtual);
         
        String sql = "UPDATE tb_genero SET nomeGenero = ? WHERE codigoGenero = ?;";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, nomeNovo);
             ps.setInt(2, codigoGenero);
             ps.execute();
             
             conexao.close();
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
     }
     
     
     public static List<Genero> listarGeneros (){
         List<Genero> generos = new ArrayList<>();
         String nomeGenero;
         String sql = "SELECT * FROM tb_genero";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()){
                 nomeGenero = rs.getString("nomeGenero");
                 Genero g = new Genero(nomeGenero);
                 generos.add(g);
             }
             conexao.close();
             return generos; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return generos;                
     }
     
     public static List<Genero> listarGeneroMusica (String nomeMusica){
         List<Genero> generos = new ArrayList<>();
         String nomeGenero;
         String sql = "SELECT tb_genero.nomeGenero FROM tb_musicaGenero \n" +
                      "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero \n" +
                      "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica \n" +
                      "WHERE tb_musica.nomeMusica = ?;";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, nomeMusica);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()){
                 nomeGenero = rs.getString("nomeGenero");
                 Genero g = new Genero(nomeGenero);
                 generos.add(g);
             }
             conexao.close();
             return generos; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return generos;                
     }
     
      public static boolean verifDuplicidade(String genero){
         boolean status;
         String sql = "SELECT * FROM tb_genero where nomeGenero = ?";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, genero);
             ResultSet rs = ps.executeQuery();
             
             status = rs.next();
             conexao.close();
             return status; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
        return false;
                  
     }
      
      public static boolean verifPessoaGenero(String genero){
         boolean status = false;
         int codigoGenero = codigoGenero(genero);
                 
         String sql = "SELECT codigoGenero FROM tb_pessoaGenero WHERE codigoGenero = ?;";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setInt(1, codigoGenero);
             ResultSet rs = ps.executeQuery();
             
             status = rs.next();
             conexao.close();
             return status; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return status;                
     }
      
      public static boolean verifMusicaGenero(String genero){
         boolean status = false;
         int codigoGenero = codigoGenero(genero);
                 
         String sql = "SELECT codigoGenero FROM tb_musicaGenero WHERE codigoGenero = ?;";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setInt(1, codigoGenero);
             ResultSet rs = ps.executeQuery();
             
             status = rs.next();
             conexao.close();
             return status; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return status;                
     }
      
      public static int qtdGeneroMusica(String nomeMusica){
         int qtdGeneros = 0;
         
         String sql = "SELECT tb_genero.codigoGenero FROM tb_musicaGenero \n" +
                      "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero \n" +
                      "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica \n" +
                      "WHERE tb_musica.nomeMusica = ?;";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, nomeMusica);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
                 qtdGeneros += 1;
             }
             conexao.close();
             return qtdGeneros;
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return qtdGeneros;         
     }
      
}
