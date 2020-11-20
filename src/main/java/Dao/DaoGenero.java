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
}
