/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PessoaGenero {

    private int idGenero;
    private int idPessoa;

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int ConsultaIdPessoa(String login) {
        //1. definir o comando sql
        String sql = "SELECT codigoPessoa FROM tb_pessoa WHERE loginPessoa = ?;";
        //2. abrir uma conexão
        ConnectionFactory fabrica = new ConnectionFactory();
        Connection c = null;
        try {
            c = fabrica.obterConexao();
            //3. pré compilar o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4. substituir os placeholders(os ?)
            ps.setString(1, login);
            //executar
            ps.executeQuery();
            
            int codigoCliente;
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigoCliente = rs.getInt("codigoPessoa");
            return codigoCliente;
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } return 0;
    }
    
    public int ConsultaidGenero(String genero) {
        //1. definir o comando sql
        String sql = "SELECT codigoGenero FROM tb_genero WHERE nomeGenero = ?;";
        //2. abrir uma conexão
        ConnectionFactory fabrica = new ConnectionFactory();
        Connection c = null;
        try {
            c = fabrica.obterConexao();
            //3. pré compilar o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4. substituir os placeholders(os ?)
            ps.setString(1, genero);
            //executar
            ps.executeQuery();
            
            int codigoGenero;
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigoGenero = rs.getInt("codigoGenero");
            return codigoGenero;
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } return 0;
    }
    
        public void CadastroPessoaGenero(int codigoGenero, int codigoPessoa){
        //1. definir o comando sql
        String sql = "INSERT INTO tb_pessoaGenero (codigoGenero, codigoPessoa) VALUES (? , ?);";
        //2. abrir uma conexão
        ConnectionFactory fabrica = new ConnectionFactory();
        Connection c = null;
        try {
            c = fabrica.obterConexao();
            //3. pré compilar o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4. substituir os placeholders(os ?)
            ps.setInt(1, codigoGenero);
            ps.setInt(2, codigoPessoa);
            //executar
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
