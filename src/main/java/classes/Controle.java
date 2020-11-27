package classes;

import Dao.DaoPessoa;
import Email.Email;
import View.Login;
import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;

public class Controle {
    
    public static void main(String[] args) {
        
           String email = "jorgelpiva@gmail.com";
        boolean verifEmail = DaoPessoa.verifEmail(email);
        if (verifEmail == true){
            DaoPessoa.recuperacaoSenha(email);
            try {
                Email.sendEmail(email);
            } catch (EmailException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Email de recuperação enviado para \n"+email);
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "O email abaixo não está cadastrado\n "+email);
        }
        
    try{
        Email.sendEmail("csatorebeca@gmail.com");    
    }catch(Exception e){
        e.printStackTrace();
    }
    Login log = new Login();
        log.setVisible(true);
    }
    
}
    
