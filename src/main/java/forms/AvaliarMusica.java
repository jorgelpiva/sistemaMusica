/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoAvaliar;
import Model.ModeloTabelaAvaliacao;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class AvaliarMusica extends javax.swing.JFrame {
    
    private ModeloTabelaAvaliacao modeloTabela = new ModeloTabelaAvaliacao();
    private DaoAvaliar selecionado = null;

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
       
       for(DaoAvaliar av: dav.listarNaoAvaliado(login)){
            modeloTabela.adicionar(av);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        avaliarTable = new javax.swing.JTable();
        loginLabel = new javax.swing.JLabel();
        AvaliacaoTextField = new javax.swing.JTextField();
        avaliarButton = new javax.swing.JButton();
        compositorTextField = new javax.swing.JTextField();
        musicaAvTextField = new javax.swing.JTextField();
        MusicaLabel = new javax.swing.JLabel();
        CompositorLabel = new javax.swing.JLabel();
        AvaliacaoLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avalie as Músicas de Seus Gêneros Favoritos!!!");

        avaliarTable.setModel(modeloTabela);
        avaliarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avaliarTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(avaliarTable);

        loginLabel.setText("jLabel1");

        AvaliacaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvaliacaoTextFieldActionPerformed(evt);
            }
        });

        avaliarButton.setText("Submeter");
        avaliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarButtonActionPerformed(evt);
            }
        });

        compositorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositorTextFieldActionPerformed(evt);
            }
        });

        MusicaLabel.setText("Musica:");

        CompositorLabel.setText("Compositor:");

        AvaliacaoLabel.setText("Avaliação:");

        sairButton.setText("Voltar ao Menu");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Minhas Avaliações");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MusicaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CompositorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(musicaAvTextField)
                            .addComponent(compositorTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvaliacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvaliacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MusicaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musicaAvTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CompositorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compositorTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvaliacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AvaliacaoTextField))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avaliarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avaliarTableMouseClicked
        DaoAvaliar dav = modeloTabela.getAvaliar(avaliarTable.getSelectedRow());
        
        musicaAvTextField.setText(dav.getNomeMusica());
        compositorTextField.setText(dav.getCompositorMusica());
        AvaliacaoTextField.setText(String.format("%s", dav.getValorAvaliacao()));
        
        selecionado = dav;
        
    }//GEN-LAST:event_avaliarTableMouseClicked

    private void AvaliacaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvaliacaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvaliacaoTextFieldActionPerformed

    private void compositorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compositorTextFieldActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void avaliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarButtonActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_avaliarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new MinhasAvaliacoes(loginLabel.getText()).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel AvaliacaoLabel;
    private javax.swing.JTextField AvaliacaoTextField;
    private javax.swing.JLabel CompositorLabel;
    private javax.swing.JLabel MusicaLabel;
    private javax.swing.JButton avaliarButton;
    private javax.swing.JTable avaliarTable;
    private javax.swing.JTextField compositorTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField musicaAvTextField;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
