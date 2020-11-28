/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoAvaliar;
import Model.ModeloTabelaAvaliacao;
import classes.Avaliar;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class AvaliarMusica extends javax.swing.JFrame {
    
    private ModeloTabelaAvaliacao modeloTabela = new ModeloTabelaAvaliacao();
    private Avaliar selecionado = null;

    /**
     * Creates new form AvaliarMusica
     */
    public AvaliarMusica() {
        initComponents();
    }
    
    public AvaliarMusica(String login) {
        initComponents();
        setLocationRelativeTo(null);
        loginLabel.setText(login);
        DaoAvaliar dav = new DaoAvaliar();
       
       for(Avaliar av: dav.listarNaoAvaliado(login)){
            modeloTabela.adicionar(av);
        }
    }

    public ModeloTabelaAvaliacao getModeloTabela() {
        return modeloTabela;
    }

    public void setModeloTabela(ModeloTabelaAvaliacao modeloTabela) {
        this.modeloTabela = modeloTabela;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        avaliarTable = new javax.swing.JTable();
        musicaAvTextField = new javax.swing.JTextField();
        compositorTextField = new javax.swing.JTextField();
        AvaliacaoTextField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        avaliarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avalie as Músicas de Seus Gêneros Favoritos!!!");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 666));

        avaliarTable.setBackground(new java.awt.Color(204, 204, 204));
        avaliarTable.setModel(modeloTabela);
        avaliarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avaliarTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(avaliarTable);

        musicaAvTextField.setBackground(new java.awt.Color(0, 0, 0));
        musicaAvTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        musicaAvTextField.setForeground(new java.awt.Color(255, 255, 255));
        musicaAvTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Música", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        musicaAvTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        musicaAvTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicaAvTextFieldActionPerformed(evt);
            }
        });

        compositorTextField.setBackground(new java.awt.Color(0, 0, 0));
        compositorTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        compositorTextField.setForeground(new java.awt.Color(255, 255, 255));
        compositorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Banda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        compositorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositorTextFieldActionPerformed(evt);
            }
        });

        AvaliacaoTextField.setBackground(new java.awt.Color(0, 0, 0));
        AvaliacaoTextField.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        AvaliacaoTextField.setForeground(new java.awt.Color(255, 255, 255));
        AvaliacaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        AvaliacaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvaliacaoTextFieldActionPerformed(evt);
            }
        });

        loginLabel.setForeground(new java.awt.Color(204, 204, 204));
        loginLabel.setText("jLabel1");

        sairButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        sairButton.setText("Voltar ao Menu");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        avaliarButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        avaliarButton.setText("Submeter");
        avaliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("GodOfWar", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Rock - Me");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AvaliacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compositorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(musicaAvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(musicaAvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(compositorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AvaliacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avaliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarButtonActionPerformed
        // TODO add your handling code here:
        try{
            if(Integer.parseInt(AvaliacaoTextField.getText()) < 1 || Integer.parseInt(AvaliacaoTextField.getText()) > 5){
                JOptionPane.showMessageDialog(this, "Digite uma avaliação entre 1 e 5");
            }else{
                DaoAvaliar.enviarAvaliacao(musicaAvTextField.getText(), loginLabel.getText(),
                    Integer.parseInt(AvaliacaoTextField.getText()));

                AvaliacaoTextField.setText("");
                musicaAvTextField.setText("");
                compositorTextField.setText("");

                modeloTabela.remover(selecionado);

                JOptionPane.showMessageDialog(this, "Música avaliada com sucesso");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Escolha uma avaliação entre 1 e 5");
        }
    }//GEN-LAST:event_avaliarButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void AvaliacaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvaliacaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvaliacaoTextFieldActionPerformed

    private void compositorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compositorTextFieldActionPerformed

    private void musicaAvTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicaAvTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicaAvTextFieldActionPerformed

    private void avaliarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avaliarTableMouseClicked
        Avaliar dav = modeloTabela.getAvaliar(avaliarTable.getSelectedRow());

        musicaAvTextField.setText(dav.getNomeMusica());
        compositorTextField.setText(dav.getCompositorMusica());
        AvaliacaoTextField.setText(String.format("%s", dav.getValorAvaliacao()));

        selecionado = dav;

    }//GEN-LAST:event_avaliarTableMouseClicked

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
            java.util.logging.Logger.getLogger(AvaliarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvaliarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvaliarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvaliarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvaliarMusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AvaliacaoTextField;
    private javax.swing.JButton avaliarButton;
    private javax.swing.JTable avaliarTable;
    private javax.swing.JTextField compositorTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField musicaAvTextField;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
