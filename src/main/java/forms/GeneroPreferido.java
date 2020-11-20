/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoGenero;
import Dao.DaoGeneroRank;
import Model.ModeloTabelaGenero;
import classes.Genero;
import classes.PessoaGenero;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class GeneroPreferido extends javax.swing.JFrame {

    private ModeloTabelaGenero modeloTabGen = new ModeloTabelaGenero();
    private DaoGeneroRank selecionado = null;
            
    public GeneroPreferido() {
        initComponents();
    }

    public GeneroPreferido(String login) {
        initComponents();
        setLocationRelativeTo(null);
        lblGeneroPref.setText(login);
        Genero genero = new Genero();
        List<Genero> generos = new ArrayList<>(genero.preencherCmbBox());
        for (Genero g : generos) {
            generoComboBox.addItem(g.getNomeGenero());
        }    
        
       DaoGeneroRank dgr = new DaoGeneroRank();
       for(DaoGeneroRank gr: dgr.ListarGenero(login)){
           modeloTabGen.adicionar(gr);
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

        lblGeneroPref = new javax.swing.JLabel();
        generoComboBox = new javax.swing.JComboBox<>();
        adicionarGeneroButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        generoTable = new javax.swing.JTable();
        sairButton = new javax.swing.JButton();
        ExcluirGeneroButton = new javax.swing.JButton();
        generoLabel = new javax.swing.JLabel();
        generoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meus Gêneros Preferidos");

        lblGeneroPref.setText("jLabel1");

        adicionarGeneroButton.setText("Adicionar Gênero");
        adicionarGeneroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarGeneroButtonActionPerformed(evt);
            }
        });

        generoTable.setModel(modeloTabGen);
        generoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(generoTable);

        sairButton.setText("Voltar ao Menu");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        ExcluirGeneroButton.setText("Excluir Gênero");
        ExcluirGeneroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirGeneroButtonActionPerformed(evt);
            }
        });

        generoTextField.setEditable(false);
        generoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoTextFieldActionPerformed(evt);
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
                        .addComponent(lblGeneroPref)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(generoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ExcluirGeneroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adicionarGeneroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(generoComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExcluirGeneroButton)
                    .addComponent(adicionarGeneroButton))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sairButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeneroPref)
                    .addComponent(generoLabel)
                    .addComponent(generoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarGeneroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarGeneroButtonActionPerformed
        // TODO add your handling code here:
        String login, genero;
        int codigoGenero, codigoPessoa;
        genero = generoComboBox.getSelectedItem().toString();
        login = lblGeneroPref.getText();
        
        boolean validarGenero = DaoGenero.consultaGeneroCadastrado(login, genero);
        
        if (validarGenero == false){
            PessoaGenero pg = new PessoaGenero();
            codigoPessoa = pg.ConsultaIdPessoa(login);
            codigoGenero = pg.ConsultaidGenero(genero);
            pg.CadastroPessoaGenero(codigoGenero, codigoPessoa);  
            DaoGeneroRank dgr = new DaoGeneroRank(genero, 0);
            modeloTabGen.adicionar(dgr);
            JOptionPane.showMessageDialog(this, "Ebaaaa! Gênero preferido Cadastrado com Sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Este Gênero já foi Cadastrado");
        }
      
    }//GEN-LAST:event_adicionarGeneroButtonActionPerformed

    private void ExcluirGeneroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirGeneroButtonActionPerformed
        DaoGenero.excluirGeneroPref(lblGeneroPref.getText(), generoTextField.getText());
        modeloTabGen.remover(selecionado);
        generoTextField.setText("");
        JOptionPane.showMessageDialog(this, "Gênero Preferido Excluído com Sucesso! ");
        
    }//GEN-LAST:event_ExcluirGeneroButtonActionPerformed

    private void generoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoTableMouseClicked
       DaoGeneroRank click = modeloTabGen.getGenero(generoTable.getSelectedRow());
       generoTextField.setText(click.getNomeGenero());
       selecionado = click;
    }//GEN-LAST:event_generoTableMouseClicked

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_sairButtonActionPerformed

    private void generoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GeneroPreferido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneroPreferido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneroPreferido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneroPreferido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneroPreferido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirGeneroButton;
    private javax.swing.JButton adicionarGeneroButton;
    private javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JTable generoTable;
    private javax.swing.JTextField generoTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGeneroPref;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
