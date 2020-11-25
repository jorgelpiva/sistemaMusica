/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoAvaliar;
import Dao.DaoRecomendacao;
import Model.ModeloTabelaRecomendacao;
import classes.Avaliar;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class ObterRecomendacao extends javax.swing.JFrame {

    private String login; 
    private ModeloTabelaRecomendacao modeloTabRecomendacao = new ModeloTabelaRecomendacao();
    private Avaliar selecionado = null;
    private String musica, compositor;
    private int avaliacao;
    

    public int getAvaliacao() {
        return avaliacao;
    }
    
    public ObterRecomendacao() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public ObterRecomendacao(String login) {
        initComponents();
        setLocationRelativeTo(null);
        this.login = login;
        loginLabel.setText(login);
        ocultar();       
        for(Avaliar posto:DaoRecomendacao.recomendacao(login)){
            modeloTabRecomendacao.adicionar(posto);
        }
    }
    
    private void ocultar(){
        avaliarPanel.setVisible(false);
        musicaTextField.setVisible(false);
        compositorTextField.setVisible(false);
        avaliacaoTextField.setVisible(false);
        darAvaliacaoButton.setVisible(false);
        cancelarButton.setVisible(false);
    }
    
       private void exibir(){
        avaliarPanel.setVisible(true);
        musicaTextField.setVisible(true);
        compositorTextField.setVisible(true);
        avaliacaoTextField.setVisible(true);
        darAvaliacaoButton.setVisible(true);
        cancelarButton.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recomendacaoTable = new javax.swing.JTable();
        avaliarPanel = new javax.swing.JPanel();
        musicaTextField = new javax.swing.JTextField();
        compositorTextField = new javax.swing.JTextField();
        avaliacaoTextField = new javax.swing.JTextField();
        darAvaliacaoButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        voltarMenuButton = new javax.swing.JButton();
        avaliarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veja as músicas mais quentes!!");
        setBackground(new java.awt.Color(1, 1, 1));
        setResizable(false);

        loginLabel.setText("jLabel1");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Músicas Recomendadas"));

        recomendacaoTable.setModel(modeloTabRecomendacao);
        recomendacaoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recomendacaoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(recomendacaoTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        avaliarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliar esta música"));

        musicaTextField.setEditable(false);
        musicaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Música"));

        compositorTextField.setEditable(false);
        compositorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Compositor"));

        avaliacaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliação"));

        darAvaliacaoButton.setText("Avaliar");
        darAvaliacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAvaliacaoButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout avaliarPanelLayout = new javax.swing.GroupLayout(avaliarPanel);
        avaliarPanel.setLayout(avaliarPanelLayout);
        avaliarPanelLayout.setHorizontalGroup(
            avaliarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avaliarPanelLayout.createSequentialGroup()
                .addGroup(avaliarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compositorTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(musicaTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(avaliarPanelLayout.createSequentialGroup()
                        .addGroup(avaliarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(avaliacaoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(darAvaliacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        avaliarPanelLayout.setVerticalGroup(
            avaliarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avaliarPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(musicaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(compositorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(avaliacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(avaliarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(darAvaliacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cancelarButton.getAccessibleContext().setAccessibleName("cancelarButton");

        voltarMenuButton.setText("Voltar ao Menu");
        voltarMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuButtonActionPerformed(evt);
            }
        });

        avaliarButton.setText("Avaliar");
        avaliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avaliarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(voltarMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avaliarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(voltarMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(loginLabel)
                .addContainerGap())
        );

        voltarMenuButton.getAccessibleContext().setAccessibleName("voltarButton");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void avaliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarButtonActionPerformed
        exibir();
        
        
    }//GEN-LAST:event_avaliarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        ocultar();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void recomendacaoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recomendacaoTableMouseClicked
        Avaliar av = modeloTabRecomendacao.getRecomendado(recomendacaoTable.getSelectedRow());
        
        musica = av.getNomeMusica();
        compositor = av.getCompositorMusica();
        musicaTextField.setText(musica);
        compositorTextField.setText(compositor);
        
        selecionado = av;
    }//GEN-LAST:event_recomendacaoTableMouseClicked

    private void darAvaliacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAvaliacaoButtonActionPerformed
        try{
            if(Integer.parseInt(avaliacaoTextField.getText()) < 1 || Integer.parseInt(avaliacaoTextField.getText()) > 5
                || avaliacaoTextField.getText() == ""){
            JOptionPane.showMessageDialog(this, "Escolha uma avaliação entre 1 e 5");
        }else{
             DaoAvaliar.enviarAvaliacao(musicaTextField.getText(), loginLabel.getText(), 
             Integer.parseInt(avaliacaoTextField.getText()));
        
        avaliacaoTextField.setText("");
        musicaTextField.setText("");
        compositorTextField.setText("");
        
        modeloTabRecomendacao.remover(selecionado);
        
        
        JOptionPane.showMessageDialog(this, "Música avaliada com sucesso");
        }
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Escolha uma avaliação entre 1 e 5"); 
        }
    }//GEN-LAST:event_darAvaliacaoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ObterRecomendacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObterRecomendacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObterRecomendacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObterRecomendacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObterRecomendacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avaliacaoTextField;
    private javax.swing.JButton avaliarButton;
    private javax.swing.JPanel avaliarPanel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField compositorTextField;
    private javax.swing.JButton darAvaliacaoButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField musicaTextField;
    private javax.swing.JTable recomendacaoTable;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
