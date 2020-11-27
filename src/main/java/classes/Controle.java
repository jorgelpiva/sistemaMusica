package classes;

import Email.Email;
import forms.Login;

public class Controle {
    
    public static void main(String[] args) {
        
    try{
        Email.sendEmail("csatorebeca@gmail.com");    
    }catch(Exception e){
        e.printStackTrace();
    }
    Login log = new Login();
        log.setVisible(true);
    }
    
}
    
