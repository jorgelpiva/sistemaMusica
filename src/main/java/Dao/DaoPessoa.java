package Dao;

import classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoPessoa {
    
    //INSERT INTO tb_pessoa (nomePessoa, loginPessoa, senhaPessoa, emailPessoa) 
    //VALUES ('Administrador', 'admin', '123456','admin@email.com');
    
    public static void cadastrarPessoa(String nomePessoa, String login, String senhaPessoa, String emailPessoa){
        boolean verifLogin;
         String sql = "INSERT INTO tb_pessoa (nomePessoa, loginPessoa, senhaPessoa, emailPessoa) \n" +
                      "VALUES (?, ? , ? , ?);";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, nomePessoa);
             ps.setString(2, login);
             ps.setString(3, senhaPessoa);
             ps.setString(4, emailPessoa);
             ps.execute();
             
             conexao.close();
   
             
         }catch(Exception e){
             e.printStackTrace();
         }
    }
    
    public static boolean verifLogin(String login){
        boolean verifLogin;
         String sql = "SELECT codigoPessoa FROM tb_pessoa WHERE loginPessoa = ?";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, login);
             ResultSet rs = ps.executeQuery();
             
             verifLogin = rs.next();
             conexao.close();
             return verifLogin; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
        return false;
    }
    
    public static boolean verifEmail(String email){
        boolean verifEmail;
         String sql = "SELECT codigoPessoa FROM tb_pessoa WHERE emailPessoa = ?";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, email);
             ResultSet rs = ps.executeQuery();
             
             verifEmail = rs.next();
             conexao.close();
             return verifEmail; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
        return false;
    }
    
    public static boolean fazerLogin(String login, String senha){
        boolean verifLogin;
         String sql = "SELECT codigoPessoa FROM tb_pessoa WHERE loginPessoa = ? AND senhaPessoa = ?";
         try(Connection conexao = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = conexao.prepareStatement(sql);
             ps.setString(1, login);
             ps.setString(2, senha);
             ResultSet rs = ps.executeQuery();
             
             verifLogin = rs.next();
             conexao.close();
             return verifLogin; 
             
         }catch(Exception e){
             e.printStackTrace();
         }
        return false;
    }
 
}
