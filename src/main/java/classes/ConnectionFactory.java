package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "riegert123";
    private String host = "localhost";
    private String porta = "3306";
    private String db ="srMusicas";
    
    public Connection obterConexao (){
        try {
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://"+host+":"+porta+"/"+db+"?useTimezone=true&serverTimezone=UTC",
            usuario,
            senha        
            );
            return c;
            
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
