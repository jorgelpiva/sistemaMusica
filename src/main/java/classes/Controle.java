package classes;

import Dao.DaoConsultaMusica;
import Dao.DaoGeneroRank;
import forms.Login;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Controle {
    
    public static void main(String[] args) {
        
      DaoGeneroRank teste = new DaoGeneroRank();
        
        teste.ListarGenero("rebeca");
               

    /*Cliente c = new Cliente();
    c.fazerCadastro("Jorge Leandro Piva", "jorgelpiva", "123456", "jorgelpiva@gmail.com");*/
    
    
    Login log = new Login();
        log.setVisible(true);
    }
    
}
    
