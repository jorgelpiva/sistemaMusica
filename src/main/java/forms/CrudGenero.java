/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoGenero;
import Model.ModeloTabelaCrudGenero;
import classes.Genero;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class CrudGenero extends javax.swing.JFrame {

    private ModeloTabelaCrudGenero modeloGenero = new ModeloTabelaCrudGenero();
    private Genero selecionado = null;
    private String nomeAtual;
    
    public CrudGenero() {
        initComponents();
    }
    
    public CrudGenero(String login) {
        initComponents();
        ocultar();
        setLocationRelativeTo(null);
        loginLabel.setText(login);
       
       for(Genero lg: DaoGenero.listarGeneros()){
            modeloGenero.adicionar(lg);
        }
    }
    private void ocultar(){
        alterarSalvarButton.setVisible(false);
        alterarTextField.setVisible(false);
        alterarPanel.setVisible(false);
    }
    
     private void reexibir(){
        alterarSalvarButton.setVisible(true);
        alterarTextField.setVisible(true);
        alterarPanel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        voltarButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        alterarPanel = new javax.swing.JPanel();
        alterarTextField = new javax.swing.JTextField();
        alterarSalvarButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        generoTextField = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGenero = new javax.swing.JTable();
        excluirButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 666));

        voltarButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        voltarButton.setText("Voltar ao Menu");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("jLabel1");

        alterarPanel.setBackground(new java.awt.Color(0, 0, 0));
        alterarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Gênero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        alterarSalvarButton.setBackground(new java.awt.Color(255, 255, 255));
        alterarSalvarButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        alterarSalvarButton.setText("Salvar Alterações");
        alterarSalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSalvarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alterarPanelLayout = new javax.swing.GroupLayout(alterarPanel);
        alterarPanel.setLayout(alterarPanelLayout);
        alterarPanelLayout.setHorizontalGroup(
            alterarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterarPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(alterarSalvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(alterarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alterarTextField)
                .addContainerGap())
        );
        alterarPanelLayout.setVerticalGroup(
            alterarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterarPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(alterarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(alterarSalvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Gênero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        generoTextField.setBackground(new java.awt.Color(0, 0, 0));
        generoTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        generoTextField.setForeground(new java.awt.Color(255, 255, 255));
        generoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Gênero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        generoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoTextFieldActionPerformed(evt);
            }
        });

        salvarButton.setBackground(new java.awt.Color(255, 255, 255));
        salvarButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        tableGenero.setModel(modeloGenero);
        tableGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGeneroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGenero);

        excluirButton.setBackground(new java.awt.Color(255, 255, 255));
        excluirButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        excluirButton.setText("Exlcuir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        alterarButton.setBackground(new java.awt.Color(255, 255, 255));
        alterarButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        alterarButton.setText("Alterar");
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
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginLabel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alterarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarButton))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(loginLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(alterarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        boolean verificarDuplicidade = DaoGenero.verifDuplicidade(generoTextField.getText().toUpperCase());
        if (verificarDuplicidade == true){
            new MsgBox("Gênero já cadastrado ").setVisible(true);
            generoTextField.setText("");
        }else{
            Genero g = new Genero(generoTextField.getText().toUpperCase());
            DaoGenero.incluirGenero(generoTextField.getText().toUpperCase());
            modeloGenero.adicionar(g);
            new MsgBox("Genero "+generoTextField.getText().toUpperCase()+" cadastrado com sucesso!").setVisible(true);
            generoTextField.setText("");
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void generoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoTextFieldActionPerformed

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
        if (selecionado == null){
            new MsgBox("Selecione o Gênero que deseja alterar! ").setVisible(true);
        }
        reexibir();
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void alterarSalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSalvarButtonActionPerformed
        boolean verificarDuplicidade = DaoGenero.verifDuplicidade(alterarTextField.getText().toUpperCase());
        if (verificarDuplicidade == true){
            new MsgBox("Gênero já cadastrado ").setVisible(true);
            ocultar();
            alterarTextField.setText("");
        }else{
        ocultar();
        DaoGenero.alterarGenero(nomeAtual, alterarTextField.getText().toUpperCase());
      
        Genero g = new Genero(alterarTextField.getText().toUpperCase());
            modeloGenero.adicionar(g);
            modeloGenero.remover(selecionado);
            new MsgBox("Genero "+alterarTextField.getText().toUpperCase()+" alterado com sucesso!").setVisible(true);
            
        }
    }//GEN-LAST:event_alterarSalvarButtonActionPerformed

    private void tableGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGeneroMouseClicked
        Genero genClicado = modeloGenero.getGenero(tableGenero.getSelectedRow());
        alterarTextField.setText(genClicado.getNomeGenero());
        selecionado = genClicado;
        nomeAtual = genClicado.getNomeGenero();
    }//GEN-LAST:event_tableGeneroMouseClicked

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        boolean vinculoMusica = DaoGenero.verifMusicaGenero(alterarTextField.getText());
        boolean vinculoPessoa = DaoGenero.verifPessoaGenero(alterarTextField.getText());
        
        if(vinculoMusica == true || vinculoPessoa == true){
            new MsgBox("Não foi Possível Excluir: Gênero vinculado(Pessoa ou Música)").setVisible(true);
        }else{
            DaoGenero.excluirGenero(alterarTextField.getText());
            modeloGenero.remover(selecionado);
            new MsgBox("Genero Excluído com sucesso.").setVisible(true);
        }
    }//GEN-LAST:event_excluirButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CrudGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudGenero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JPanel alterarPanel;
    private javax.swing.JButton alterarSalvarButton;
    private javax.swing.JTextField alterarTextField;
    private javax.swing.JButton excluirButton;
    private javax.swing.JTextField generoTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTable tableGenero;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}