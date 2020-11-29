/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoPessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Cadastro extends javax.swing.JFrame {
    
    private String senha, senha1;

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nomeCadastroTextField = new javax.swing.JTextField();
        usuarioCadastroTextField = new javax.swing.JTextField();
        emailCadastroTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        senhaCadastroPassword = new javax.swing.JPasswordField();
        senhaCadastroConfirmPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("GodOfWar", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Rock - Me");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 666));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastre-se", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        nomeCadastroTextField.setBackground(new java.awt.Color(0, 0, 0));
        nomeCadastroTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        nomeCadastroTextField.setForeground(new java.awt.Color(255, 255, 255));
        nomeCadastroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o seu nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        nomeCadastroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCadastroTextFieldActionPerformed(evt);
            }
        });

        usuarioCadastroTextField.setBackground(new java.awt.Color(0, 0, 0));
        usuarioCadastroTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        usuarioCadastroTextField.setForeground(new java.awt.Color(255, 255, 255));
        usuarioCadastroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o seu Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        usuarioCadastroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioCadastroTextFieldActionPerformed(evt);
            }
        });

        emailCadastroTextField.setBackground(new java.awt.Color(0, 0, 0));
        emailCadastroTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        emailCadastroTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailCadastroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite um email válido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        emailCadastroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailCadastroTextFieldActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        senhaCadastroPassword.setBackground(new java.awt.Color(0, 0, 0));
        senhaCadastroPassword.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        senhaCadastroPassword.setForeground(new java.awt.Color(255, 255, 255));
        senhaCadastroPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite sua senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        senhaCadastroPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCadastroPasswordActionPerformed(evt);
            }
        });

        senhaCadastroConfirmPassword.setBackground(new java.awt.Color(0, 0, 0));
        senhaCadastroConfirmPassword.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        senhaCadastroConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        senhaCadastroConfirmPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirme sua Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(senhaCadastroConfirmPassword)
                    .addComponent(senhaCadastroPassword)
                    .addComponent(usuarioCadastroTextField)
                    .addComponent(nomeCadastroTextField)
                    .addComponent(emailCadastroTextField)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(nomeCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaCadastroPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaCadastroConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("GodOfWar", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Rock - Me");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(286, 286, 286)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCadastroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCadastroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCadastroTextFieldActionPerformed

    private void senhaCadastroPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCadastroPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaCadastroPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            
            senha = new String(senhaCadastroPassword.getPassword());
            senha1 = new String(senhaCadastroConfirmPassword.getPassword());
            if(Dao.DaoPessoa.verifEmail(emailCadastroTextField.getText())==true){
                new MsgBox("Email já cadastrado!!! ").setVisible(true);
            }else{
                if(senha.equals(senha1)){  
                    
                    boolean validarLogin = DaoPessoa.verifLogin(usuarioCadastroTextField.getText().toLowerCase());

                    if (validarLogin == true){
                        new MsgBox("Usuário já cadastrado! Escolha outro nome !!!!").setVisible(true);
                    }else{    
                    DaoPessoa.cadastrarPessoa(nomeCadastroTextField.getText(),usuarioCadastroTextField.getText().toLowerCase(),
                            senha, emailCadastroTextField.getText());
                    new MsgBox("Usuário Cadastrado com sucesso!!!").setVisible(true);
                    this.dispose();
                    }
                }else{
                    new MsgBox("As senhas não conferem! ").setVisible(true);
                }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void usuarioCadastroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioCadastroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioCadastroTextFieldActionPerformed

    private void emailCadastroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailCadastroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailCadastroTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailCadastroTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeCadastroTextField;
    private javax.swing.JPasswordField senhaCadastroConfirmPassword;
    private javax.swing.JPasswordField senhaCadastroPassword;
    private javax.swing.JTextField usuarioCadastroTextField;
    // End of variables declaration//GEN-END:variables
}
