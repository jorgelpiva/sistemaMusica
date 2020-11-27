package Email;

import Dao.DaoPessoa;
import classes.Pessoa;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Classe responsável por enviar E-mail.
 * @author Denner Dias
 */
public class Email {    
       public static void sendEmail(String destinatario) throws EmailException {
        Pessoa p = DaoPessoa.recuperacaoSenha(destinatario);
        SimpleEmail email = new SimpleEmail();
        // Utilize o hostname do seu provedor de email
        //System.out.println("alterando hostname...");
        email.setHostName("smtp.gmail.com");
 
        // Quando a porta utilizada não é a padrão (gmail = 465)
        email.setSmtpPort(587);
 
        // Adicione os destinatários
        email.addTo(destinatario);
        
        email.addCc("recuperasenharockme@gmail.com");
 
        // Configure o seu email do qual enviará
        email.setFrom("recuperasenharockme@gmail.com", "Equipe Rock me");
 
        // Adicione um assunto
        email.setSubject("Lembrete de senha");
 
        // Adicione a mensagem do email
        email.setMsg("Olá, \n"
                + "você está recebendo este email porque está cadastrado(a) em nosso Sistema de Recomendação de Músicas Rock - Me\n\n"
                + "Seguem seus dados de acesso \n"
                + "Login: "+p.getLoginPessoa()+"\n"
                + "Senha: "+p.getSenhaPessoa());
 
        // Para autenticar no servidor é necessário chamar os dois métodos abaixo
        email.setSSL(true);
        email.setTLS(true);
        email.setAuthentication("recuperasenharockme@gmail.com", "Rockme2020");
        email.send();
    }
}
