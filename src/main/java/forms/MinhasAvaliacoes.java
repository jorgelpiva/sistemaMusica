/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoAvaliar;
import Model.ModeloTabelaAvaliacao;
import classes.Avaliar;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class MinhasAvaliacoes extends javax.swing.JFrame {
    
    private ModeloTabelaAvaliacao modeloAvaliado = new ModeloTabelaAvaliacao();
    private Avaliar selecionado = null;
    private String musica, compositor;
    private double avaliacao;
    private int resposta;

    /**
     * Creates new form MinhasAvaliacoes
     */
    public MinhasAvaliacoes() {
        initComponents();
    }
    
    public MinhasAvaliacoes(String login) {
        initComponents();
        setLocationRelativeTo(null);
        loginLabel.setText(login);
        
        
        
        for(Avaliar av : DaoAvaliar.avaliacoesConcedidas(login)){
            modeloAvaliado.adicionar(av);
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

        jPanel1 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        avaliadoTable = new javax.swing.JTable();
        reavaliarButton = new javax.swing.JButton();
        ExcluirAvaliacaoButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veja as avaliações que você já fez!!!");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 666));

        loginLabel.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        loginLabel.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Suas Avaliações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        avaliadoTable.setModel(modeloAvaliado);
        avaliadoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avaliadoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(avaliadoTable);

        reavaliarButton.setBackground(new java.awt.Color(255, 255, 255));
        reavaliarButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        reavaliarButton.setText("Reavaliar");
        reavaliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reavaliarButtonActionPerformed(evt);
            }
        });

        ExcluirAvaliacaoButton.setBackground(new java.awt.Color(255, 255, 255));
        ExcluirAvaliacaoButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        ExcluirAvaliacaoButton.setText("Excluir Avaliação");
        ExcluirAvaliacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirAvaliacaoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExcluirAvaliacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reavaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(reavaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExcluirAvaliacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        sairButton.setBackground(new java.awt.Color(255, 255, 255));
        sairButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        sairButton.setText("Voltar");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(sairButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginLabel)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avaliadoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avaliadoTableMouseClicked
        Avaliar dav = modeloAvaliado.getAvaliar(avaliadoTable.getSelectedRow());
        
        musica = dav.getNomeMusica();
        compositor = dav.getCompositorMusica();
        avaliacao = dav.getValorAvaliacao();
        
        selecionado = dav;
    }//GEN-LAST:event_avaliadoTableMouseClicked

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void ExcluirAvaliacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirAvaliacaoButtonActionPerformed
        resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que quer excluir a avaliação da música "+ musica);
        if (resposta == 0){

            if (musica == null){
                JOptionPane.showMessageDialog(this,"Selecione uma Avaliação para Excluir! ");
            }else{
               DaoAvaliar.excluirAvaliacao(loginLabel.getText(), musica);
               modeloAvaliado.remover(selecionado);
               JOptionPane.showMessageDialog(this, "Avaliação Excluída com sucesso!! ");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Opção cancelada!!");
        }
    }//GEN-LAST:event_ExcluirAvaliacaoButtonActionPerformed

    private void reavaliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reavaliarButtonActionPerformed
        if (musica == null){
            new MsgBox("Selecione uma Avaliação para Alterar! ").setVisible(true);
        }else{
             new Reavaliar(loginLabel.getText(), musica, compositor).setVisible(true);
             this.dispose();
        }
    }//GEN-LAST:event_reavaliarButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    public ModeloTabelaAvaliacao getModeloAvaliado() {
        return modeloAvaliado;
    }

    public void setModeloAvaliado(ModeloTabelaAvaliacao modeloAvaliado) {
        this.modeloAvaliado = modeloAvaliado;
    }

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
            java.util.logging.Logger.getLogger(MinhasAvaliacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinhasAvaliacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinhasAvaliacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinhasAvaliacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinhasAvaliacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirAvaliacaoButton;
    private javax.swing.JTable avaliadoTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton reavaliarButton;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
