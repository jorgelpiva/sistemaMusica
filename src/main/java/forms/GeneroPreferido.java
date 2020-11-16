/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Dao.DaoGeneroPreferido;
import Dao.DaoGeneroRank;
import classes.ConnectionFactory;
import classes.Genero;
import classes.PessoaGenero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorge
 */
public class GeneroPreferido extends javax.swing.JFrame {

    /**
     * Creates new form GeneroPreferido
     */
    public GeneroPreferido() {
        initComponents();
    }

    public GeneroPreferido(String login) {
        initComponents();
        lblGeneroPref.setText(login);
        Genero genero = new Genero();
        List<Genero> generos = new ArrayList<>(genero.preencherCmbBox());
        for (Genero g : generos) {
            generoComboBox.addItem(g.getNomeGenero());
        }    
       DefaultTableModel tabela = (DefaultTableModel) generoTable.getModel();
       tabela.setNumRows(0);
       DaoGeneroRank dgr = new DaoGeneroRank();
       
       for(DaoGeneroRank gr: dgr.ListarGenero(login)){
           
       
            tabela.addRow(new Object []{
                gr.getNomeGenero(),
                gr.getVlAvaliacao()
            });
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
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meus Gêneros Preferidos");

        lblGeneroPref.setText("jLabel1");

        adicionarGeneroButton.setText("Adicionar Gênero");
        adicionarGeneroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarGeneroButtonActionPerformed(evt);
            }
        });

        generoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Gêneros Escolhidos", "Rank Gênero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(generoTable);

        jButton2.setText("Voltar ao Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGeneroPref)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(adicionarGeneroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarGeneroButton)
                    .addComponent(jButton2))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(lblGeneroPref)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void adicionarGeneroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarGeneroButtonActionPerformed
        // TODO add your handling code here:
        String login, genero;
        int codigoGenero, codigoPessoa;
        genero = generoComboBox.getSelectedItem().toString();
        login = lblGeneroPref.getText();
        PessoaGenero pg = new PessoaGenero();
        codigoPessoa = pg.ConsultaIdPessoa(login);
        codigoGenero = pg.ConsultaidGenero(genero);
        pg.CadastroPessoaGenero(codigoGenero, codigoPessoa);
        JOptionPane.showMessageDialog(this, "Genero Preferido Cadastrado com Sucesso!!!");
          DefaultTableModel tabela = (DefaultTableModel) generoTable.getModel();
       tabela.setNumRows(0);
       DaoGeneroRank dgr = new DaoGeneroRank();
       
       for(DaoGeneroRank gr: dgr.ListarGenero(login)){
           
       
            tabela.addRow(new Object []{
                gr.getNomeGenero(),
                gr.getVlAvaliacao()
            });
       }
    }//GEN-LAST:event_adicionarGeneroButtonActionPerformed

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
    private javax.swing.JButton adicionarGeneroButton;
    private javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JTable generoTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGeneroPref;
    // End of variables declaration//GEN-END:variables
}
