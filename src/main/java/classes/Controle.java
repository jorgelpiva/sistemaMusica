package classes;

import Dao.DaoConsultaMusica;
import Dao.DaoGenero;
import Dao.DaoGeneroRank;
import forms.Login;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Controle {
    
    public static void main(String[] args) {
        
        
        boolean vinculoMusica = DaoGenero.verifMusicaGenero("NEW AGE");
        boolean vinculoPessoa = DaoGenero.verifPessoaGenero("NEW AGE");
        
        if(vinculoMusica == true || vinculoPessoa == true){
            JOptionPane.showMessageDialog(null, "Não é possível excluir: O Gênero está vinculado(Pessoa ou Música)");
        }else{
            DaoGenero.excluirGenero("NEW AGE");
      
            JOptionPane.showMessageDialog(null, "Genero Excluído com sucesso.");
        }             

    /*Cliente c = new Cliente();
    c.fazerCadastro("Jorge Leandro Piva", "jorgelpiva", "123456", "jorgelpiva@gmail.com");*/
    
    
    Login log = new Login();
        log.setVisible(true);
    }
    
}
    
