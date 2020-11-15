package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import classes.Pessoa;

public class Cliente extends Pessoa {
    private String emailCliente;
    
    public Cliente(){
        
    }
    
    /*public Cliente(String nomePessoa, String loginPessoa, String senhaPessoa, String emailCliente){
        super(nomePessoa, senhaPessoa, loginPessoa);
        this.emailCliente = emailCliente;
    }*/
    
    public void fazerCadastro(String nomePessoa, String loginPessoa, String senhaPessoa, String emailCliente){
        //1. definir o comando sql
        String sql = "INSERT INTO tb_pessoa (nomePessoa, loginPessoa, senhaPessoa, emailPessoa) VALUES (? , ? , ? , ?);";
        //2. abrir uma conexão
        ConnectionFactory fabrica = new ConnectionFactory();
        Connection c = null;
        try {
            c = fabrica.obterConexao();
            //3. pré compilar o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4. substituir os placeholders(os ?)
            ps.setString(1, nomePessoa);
            ps.setString(2, loginPessoa);
            ps.setString(3, senhaPessoa);
            ps.setString(4, emailCliente);
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
    
        public boolean verificarLogin(String login) {
        boolean check = false;
        //1 Definir o comando SQL
        String sql = "SELECT loginPessoa FROM tb_pessoa WHERE loginPessoa = ?;";
        //2.Abrir conexão
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setString(1, login);
            //4. Executar
            ResultSet rs = ps.executeQuery();
            if (rs.next() == true) {
                check = true;
            }else{
                check = false;
            }  
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
    
    public void selecionarGeneroPref(){
        
    }
    
    public void removerGeneroPref(){
        
    }
    
    public void obterRecomendacao(){
        
    }
    
}
