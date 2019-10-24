/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.view.updates;

import br.edu.ifpr.bean.Proprietario;
import br.edu.ifpr.dao.ProprietarioDAO;
import br.edu.ifpr.util.ConnectionFactory;
import br.edu.ifpr.util.GenericComboBoxModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class EditarProprietarios extends javax.swing.JFrame {

    private GenericComboBoxModel<Proprietario> proprietarioModel;

    /**
     * Creates new form ApagarCategoria
     */
    public EditarProprietarios() throws SQLException {
        initComponents();
        iniciaComboBox();
    }

    public void iniciaComboBox() throws SQLException {
        Connection con = ConnectionFactory.createConnectionToMySQL();
        //PROPRIETARIO
        proprietarioModel = new GenericComboBoxModel();
        ProprietarioDAO pDAO = new ProprietarioDAO(con);

        for (int i = 1; i <= pDAO.retornaQTD(); i++) {

            if (pDAO.retrieve(i) != null) {
                Proprietario proprietario = pDAO.retrieve(i);
                proprietarioModel.addElement(proprietario);
            }
        }
        cbProprietario.setModel(proprietarioModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancela = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cbProprietario = new javax.swing.JComboBox<>();
        lblEndereco = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txEndereco = new javax.swing.JTextField();
        txBairro = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txTelefone = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txCpf = new javax.swing.JTextField();
        lblRg = new javax.swing.JLabel();
        txNascimento = new javax.swing.JTextField();
        txRg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCancela.setText("Cancelar");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        btnAtualiza.setText("Atualiza Propretário");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Editar Proprietários");

        lblCategoria.setText("Proprietário:");

        cbProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProprietarioActionPerformed(evt);
            }
        });

        lblEndereco.setText("Endereço: ");

        lblBairro.setText("Bairro: ");

        lblTelefone.setText("Telefone:");

        lblNome.setText("Nome:");

        jLabel3.setText("Data Nascimento:");

        jLabel2.setText("CPF:");

        lblRg.setText("RG: ");

        txNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNascimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 206, Short.MAX_VALUE))
                            .addComponent(cbProprietario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancela)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualiza)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNome)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addComponent(txEndereco)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblRg)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txRg))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblBairro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txBairro))))
                                .addComponent(txNome)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEndereco)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txNascimento)))
                    .addGap(15, 15, 15)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancela)
                    .addComponent(btnAtualiza))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRg)
                        .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEndereco)
                        .addComponent(lblBairro)
                        .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefone)
                        .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNascimentoActionPerformed

    private void cbProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProprietarioActionPerformed
        GenericComboBoxModel<Proprietario> cBoxProprietario = (GenericComboBoxModel<Proprietario>) cbProprietario.getModel();
        txNome.setText(cBoxProprietario.getSelectedItem().getNome());
        txBairro.setText(cBoxProprietario.getSelectedItem().getBairro());
        txCpf.setText(cBoxProprietario.getSelectedItem().getCpf());
        txEndereco.setText(cBoxProprietario.getSelectedItem().getBairro());
        txNascimento.setText(String.valueOf(cBoxProprietario.getSelectedItem().getNascimento()));
        txRg.setText(cBoxProprietario.getSelectedItem().getRg());
        txTelefone.setText(cBoxProprietario.getSelectedItem().getTelefone());
    }//GEN-LAST:event_cbProprietarioActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
      GenericComboBoxModel<Proprietario> cBoxProprietario = (GenericComboBoxModel<Proprietario>) cbProprietario.getModel();
        if (txNome.getText().equals("")) {
            //Exibe Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Você deixou algum campo sem "
                    + "preenchimento. Cuidado!", "Erro falta de prrenchimento",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                 //Colocando data (errado)
                java.util.Date data = new java.util.Date();
                java.sql.Date dataSql = new java.sql.Date(data.getTime());
                if (cBoxProprietario.getSelectedItem() != null) {
                    //Conexao
                    Connection con = ConnectionFactory.createConnectionToMySQL();

                    ProprietarioDAO dao = new ProprietarioDAO(con);

                    Proprietario atualiza = new Proprietario(cBoxProprietario.getSelectedItem().getId(), 
                            txNome.getText(), txEndereco.getText(), txBairro.getText(),
                            txCpf.getText(), txTelefone.getText(), txRg.getText(), dataSql);
                    dao.update(atualiza);
                    int input = JOptionPane.showConfirmDialog(null, "Registro efetuado,"
                            + " deseja fazer mais edições?");
                    // 0= Sim, 1= Não
                    if (input == 1) {
                        this.dispose();
                    }
                } else {
                    //Exibe Mensagem de Erro
                    JOptionPane.showMessageDialog(null, "Você deixou algum campo sem "
                            + "preenchimento. Cuidado!", "Erro falta de prrenchimento",
                            JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(EditarEstados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAtualizaActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProprietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProprietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProprietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProprietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditarProprietarios().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditarProprietarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnCancela;
    private javax.swing.JComboBox<Proprietario> cbProprietario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txBairro;
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txNascimento;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txRg;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables

}
