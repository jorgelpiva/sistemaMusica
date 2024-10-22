/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoGenero;
import Dao.DaoMusica;
import Model.ModeloTabelaAvaliacao;
import Model.ModeloTabelaCrudGenero;
import Model.ModeloTabelaCrudMusica;
import classes.Genero;
import classes.Musica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class CrudMusica extends javax.swing.JFrame {

    private String login;
    private ModeloTabelaCrudMusica modeloMusicaTable = new ModeloTabelaCrudMusica();
    private Musica selecionadoMusica = null;
    private String nomeDaMusica;
    private String compositorDaMusica;
    
    public CrudMusica() {
        initComponents();
    }
    
    public CrudMusica(String login) {
        initComponents();
        setLocationRelativeTo(null);
        loginLabel.setText(login);
        this.login = loginLabel.getText();   
        List<Genero> generos = new ArrayList<>(DaoGenero.listarGeneros());
        for (Genero g : generos) {
            generoCadastroComboBox.addItem(g.getNomeGenero());
        }
        for(Musica m: Dao.DaoMusica.listarMusicas()){
            modeloMusicaTable.adicionar(m);
        }
        
    }        
      
      private void limparCampos(){
          musicaCadastroTextField.setText("");
          compositorCadastroTextField.setText("");
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        musicaTable = new javax.swing.JTable();
        musicaCadastroTextField = new javax.swing.JTextField();
        compositorCadastroTextField = new javax.swing.JTextField();
        generoCadastroComboBox = new javax.swing.JComboBox<>();
        SalvarButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Músicas");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 666));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Música", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        musicaTable.setModel(modeloMusicaTable);
        musicaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musicaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(musicaTable);

        musicaCadastroTextField.setBackground(new java.awt.Color(0, 0, 0));
        musicaCadastroTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        musicaCadastroTextField.setForeground(new java.awt.Color(255, 255, 255));
        musicaCadastroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome da Música", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        musicaCadastroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicaCadastroTextFieldActionPerformed(evt);
            }
        });

        compositorCadastroTextField.setBackground(new java.awt.Color(0, 0, 0));
        compositorCadastroTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        compositorCadastroTextField.setForeground(new java.awt.Color(255, 255, 255));
        compositorCadastroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Banda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        generoCadastroComboBox.setBackground(new java.awt.Color(0, 0, 0));
        generoCadastroComboBox.setForeground(new java.awt.Color(254, 254, 254));
        generoCadastroComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gênero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(254, 254, 254))); // NOI18N
        generoCadastroComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoCadastroComboBoxActionPerformed(evt);
            }
        });

        SalvarButton.setBackground(new java.awt.Color(255, 255, 255));
        SalvarButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        SalvarButton.setText("Salvar Música");
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton3.setText("Excluir Música");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        alterarButton.setBackground(new java.awt.Color(255, 255, 255));
        alterarButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        alterarButton.setText("Alterar Música");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addComponent(musicaCadastroTextField)
                    .addComponent(compositorCadastroTextField)
                    .addComponent(generoCadastroComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SalvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(musicaCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(compositorCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generoCadastroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel4.setBackground(new java.awt.Color(254, 254, 254));
        jLabel4.setFont(new java.awt.Font("GodOfWar", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Rock - Me");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton4.setText("Voltar Ao Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(loginLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginLabel)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
        String musicaNome = musicaCadastroTextField.getText();
        String musicaCompositor = compositorCadastroTextField.getText();
        
        boolean duplicidade = DaoMusica.verifDuplicidade(musicaNome, musicaCompositor);
        
        if (duplicidade == true){
            new MsgBox("Ops!! Música já cadastrada! ").setVisible(true);
            limparCampos();
        }else{
        //processo de inserção
            Dao.DaoMusica.incluirMusicaTbMusica(musicaNome, musicaCompositor);
            int codigoGenero = DaoGenero.codigoGenero(generoCadastroComboBox.getSelectedItem().toString());
            int codigoMusica = DaoMusica.codigoMusica(musicaNome, musicaCompositor);
            DaoMusica.incluirMusicaTbMusicaGenero(codigoMusica, codigoGenero);
            Musica musica = new Musica(musicaNome, musicaCompositor);
            modeloMusicaTable.adicionar(musica);
            new MsgBox("Música adicionada com Sucesso!!! ").setVisible(true);
            limparCampos();
        }
    }//GEN-LAST:event_SalvarButtonActionPerformed

    private void musicaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicaTableMouseClicked
        Musica mu = modeloMusicaTable.getMusica(musicaTable.getSelectedRow());
        
        nomeDaMusica = mu.getNomeMusica();
        compositorDaMusica = mu.getCompositorMusica();
        
        selecionadoMusica = mu;
        
    }//GEN-LAST:event_musicaTableMouseClicked

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
       if(nomeDaMusica == null){
           new MsgBox("Selecione a música que deseja alterar").setVisible(true);
       }else{
           new ManutencaoMusica(loginLabel.getText(), nomeDaMusica, compositorDaMusica, DaoMusica.codigoMusica(nomeDaMusica, compositorDaMusica)).setVisible(true);
           this.dispose();
       }
       
       
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean musicaAvaliada = DaoMusica.verifSeAvaliada(nomeDaMusica, compositorDaMusica);
        if(musicaAvaliada == true){
            new MsgBox("Imposível excluir a músicas já avaliadas!! ").setVisible(true);
        }else{
            DaoMusica.excluirMusicaGenero(nomeDaMusica, compositorDaMusica);
            DaoMusica.excluirMusica(nomeDaMusica, compositorDaMusica);
            modeloMusicaTable.remover(selecionadoMusica);
            new MsgBox("Música Excluída com sucesso!!! ").setVisible(true);
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void musicaCadastroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicaCadastroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicaCadastroTextFieldActionPerformed

    private void generoCadastroComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoCadastroComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoCadastroComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CrudMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudMusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalvarButton;
    private javax.swing.JButton alterarButton;
    private javax.swing.JTextField compositorCadastroTextField;
    private javax.swing.JComboBox<String> generoCadastroComboBox;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField musicaCadastroTextField;
    private javax.swing.JTable musicaTable;
    // End of variables declaration//GEN-END:variables
}
