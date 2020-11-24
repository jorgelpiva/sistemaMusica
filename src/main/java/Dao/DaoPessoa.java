package Dao;

import classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoPessoa {
    
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
 
}
