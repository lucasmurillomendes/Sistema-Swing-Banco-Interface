/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.view.creates;

import br.edu.ifpr.bean.Categoria;
import br.edu.ifpr.bean.Marca;
import br.edu.ifpr.bean.Municipio;
import br.edu.ifpr.bean.Proprietario;
import br.edu.ifpr.bean.Veiculo;
import br.edu.ifpr.dao.CategoriaDAO;
import br.edu.ifpr.dao.MarcaDAO;
import br.edu.ifpr.dao.MunicipioDAO;
import br.edu.ifpr.dao.ProprietarioDAO;
import br.edu.ifpr.dao.VeiculoDAO;
import br.edu.ifpr.util.ConnectionFactory;
import br.edu.ifpr.util.GenericComboBoxModel;
import br.edu.ifpr.util.IniciaComboBox;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class CadastrarVeiculo extends javax.swing.JFrame {

    Connection con = ConnectionFactory.createConnectionToMySQL();

    /**
     * Creates new form CadastrarVeiculo
     */
    public CadastrarVeiculo() throws Exception {
        initComponents();
        IniciaComboBox inicia = new IniciaComboBox();
        inicia.iniciarComboBoxProprietario(cbProprietario);
        inicia.iniciarComboBoxMunicipio(cbMunicipio);
        inicia.iniciarComboBoxMarca(cbMarca);
        inicia.iniciarComboBoxCategoria(cbCategoria);
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
        lblPlaca = new javax.swing.JLabel();
        txPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        lblProprietario = new javax.swing.JLabel();
        cbProprietario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbMunicipio = new javax.swing.JComboBox<>();
        cbMarca = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txAno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(480, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Veículo");

        lblPlaca.setText("Placa: ");

        jLabel3.setText("Ano:");

        lblCategoria.setText("Categoria: ");

        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        lblProprietario.setText("Proprietário: ");

        jLabel2.setText("Marca:");

        jLabel4.setText("Município:");

        cbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMunicipioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlaca)
                            .addComponent(lblProprietario))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txAno))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(cbProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProprietario)
                    .addComponent(cbProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblPlaca)
                    .addComponent(txAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMunicipioActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txPlaca.getText().equals("") || txAno.getText().equals("")) {
            //Exibe Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Você deixou algum campo sem "
                    + "preenchimento. Cuidado!", "Erro falta de prrenchimento",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            //Colocando data (errado)
            java.util.Date data = new java.util.Date();
            java.sql.Date dataSql = new java.sql.Date(data.getTime());
            // Date comparacao = dataSql;
            //Recuperando Proprietário
            if (cbCategoria.getSelectedItem() == null || cbMarca.getSelectedItem() == null
                    || cbMunicipio.getSelectedItem() == null || cbProprietario.getSelectedItem() == null) {
                //Exibe Mensagem de Erro
                JOptionPane.showMessageDialog(null, "Você deixou algum campo sem "
                        + "preenchimento. Cuidado!", "Erro falta de prrenchimento",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                GenericComboBoxModel<Proprietario> cBoxProprietario = (GenericComboBoxModel<Proprietario>) cbProprietario.getModel();
                //Recuperando Municipio
                GenericComboBoxModel<Municipio> cBoxMunicipio = (GenericComboBoxModel<Municipio>) cbMunicipio.getModel();
                //Recuperando Marca
                GenericComboBoxModel<Marca> cBoxMarca = (GenericComboBoxModel<Marca>) cbMarca.getModel();
                //Recuperando Categoria
                GenericComboBoxModel<Categoria> cBoxCategoria = (GenericComboBoxModel<Categoria>) cbCategoria.getModel();
                //Criando Veículo
                Veiculo veiculo = new Veiculo(0, txPlaca.getText(), dataSql,
                        cBoxCategoria.getSelectedItem(), cBoxProprietario.getSelectedItem(),
                        cBoxMarca.getSelectedItem(), cBoxMunicipio.getSelectedItem());
                
                VeiculoDAO dao = new VeiculoDAO(con);
                dao.create(veiculo);
                
                int input = JOptionPane.showConfirmDialog(null, "Registro efetuado,"
                        + " deseja fazer mais cadastros?");
                // 0= Sim, 1= Não
                System.out.println(input);
                if (input == 1) {
                    this.dispose();
                }
            }
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastrarVeiculo().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(CadastrarVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<Categoria> cbCategoria;
    private javax.swing.JComboBox<Marca> cbMarca;
    private javax.swing.JComboBox<Municipio> cbMunicipio;
    private javax.swing.JComboBox<Proprietario> cbProprietario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblProprietario;
    private javax.swing.JTextField txAno;
    private javax.swing.JTextField txPlaca;
    // End of variables declaration//GEN-END:variables
}
