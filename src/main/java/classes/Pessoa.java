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
}
