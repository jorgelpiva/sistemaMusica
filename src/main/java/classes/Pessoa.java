//Esta classe trata dos usuários da aplicação de forma generalizada
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nomePessoa;
    private String loginPessoa;
    private String senhaPessoa;
   
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getLoginPessoa() {
        return loginPessoa;
    }

    public void setLoginPessoa(String loginPessoa) {
        this.loginPessoa = loginPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    
    public Pessoa (){
        
    }
    
    public Pessoa(String loginPessoa, String senhaPessoa){
        this.loginPessoa = loginPessoa;
        this.senhaPessoa = senhaPessoa;
    }
    
    public Pessoa(String nomePessoa, String loginPessoa, String senhaPessoa){
        this.nomePessoa = nomePessoa;
        this.loginPessoa = loginPessoa;
        this.senhaPessoa = senhaPessoa;
    }
    
        public boolean validarLogin() {
        boolean check = false;
        //1 Definir o comando SQL
        String sql = "SELECT loginPessoa, senhaPessoa FROM tb_pessoa WHERE loginPessoa = ? and senhaPessoa = ?;";
        //2.Abrir conexão
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setString(1, this.loginPessoa);
            ps.setString(2, this.senhaPessoa);
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
}
