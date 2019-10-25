/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.view.updates;

import br.edu.ifpr.bean.Categoria;
import br.edu.ifpr.bean.Marca;
import br.edu.ifpr.bean.Municipio;
import br.edu.ifpr.bean.Proprietario;
import br.edu.ifpr.bean.Veiculo;
import br.edu.ifpr.dao.VeiculoDAO;
import br.edu.ifpr.util.ConnectionFactory;
import br.edu.ifpr.util.GenericComboBoxModel;
import br.edu.ifpr.util.IniciaComboBox;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class EditarVeiculos extends javax.swing.JFrame {

    //Conexão
    Connection con = ConnectionFactory.createConnectionToMySQL();

    /**
     * Creates new form EditarVeiculos
     */
    public EditarVeiculos() throws Exception {
        initComponents();
        IniciaComboBox iniciar = new IniciaComboBox();
        iniciar.iniciarComboBoxMunicipio(cbMunicipio);
        iniciar.iniciarComboBoxProprietario(cbProprietario);
        iniciar.iniciarComboBoxCategoria(cbCategoria);
        iniciar.iniciarComboBoxMarca(cbMarca);
        iniciar.iniciarComboBoxVeiculo(cbVeiculo);
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
        jLabel2 = new javax.swing.JLabel();
        cbVeiculo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbMunicipio = new javax.swing.JComboBox<>();
        cbMarca = new javax.swing.JComboBox<>();
        lblPlaca = new javax.swing.JLabel();
        txPlaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txAno = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        lblProprietario = new javax.swing.JLabel();
        cbProprietario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAtualizarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Editar Veículos Cadastrados");

        jLabel2.setText("Veículo: ");

        cbVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVeiculoActionPerformed(evt);
            }
        });

        jLabel3.setText("Selecione abaixo os novos dados do veículo selecionado:");

        jLabel4.setText("Município:");

        cbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMunicipioActionPerformed(evt);
            }
        });

        lblPlaca.setText("Placa: ");

        jLabel5.setText("Ano:");

        lblCategoria.setText("Categoria: ");

        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        lblProprietario.setText("Proprietário: ");

        jLabel6.setText("Marca:");

        jLabel7.setText("*Siga os mesmos padrões dos campos!");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAtualizarRegistro.setText("Atualizar Veiculo");
        btnAtualizarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
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
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txAno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cbProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizarRegistro))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProprietario)
                    .addComponent(cbProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblPlaca)
                    .addComponent(txAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAtualizarRegistro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMunicipioActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void btnAtualizarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarRegistroActionPerformed
        //Verificando Campos Nulos
        if (txPlaca.getText().equals("") || txAno.getText().equals("")
                || cbVeiculo.getSelectedItem() == null
                || cbCategoria.getSelectedItem() == null
                || cbMarca.getSelectedItem() == null
                || cbMunicipio.getSelectedItem() == null
                || cbProprietario.getSelectedItem() == null) {
            //Exibe Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Você deixou algum campo sem "
                    + "preenchimento. Cuidado!", "Erro falta de prrenchimento",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                //Colocando data (errado)
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Date data = df.parse(txAno.getText());
                //Recuperando Veiculo
                GenericComboBoxModel<Veiculo> cBoxVeiculo = (GenericComboBoxModel<Veiculo>) cbVeiculo.getModel();
                //Recuperando Proprietário
                GenericComboBoxModel<Proprietario> cBoxProprietario = (GenericComboBoxModel<Proprietario>) cbProprietario.getModel();
                //Recuperando Municipio
                GenericComboBoxModel<Municipio> cBoxMunicipio = (GenericComboBoxModel<Municipio>) cbMunicipio.getModel();
                //Recuperando Marca
                GenericComboBoxModel<Marca> cBoxMarca = (GenericComboBoxModel<Marca>) cbMarca.getModel();
                //Recuperando Categoria
                GenericComboBoxModel<Categoria> cBoxCategoria = (GenericComboBoxModel<Categoria>) cbCategoria.getModel();
                
                //Criando Veículo
                Veiculo veiculo = new Veiculo(cBoxVeiculo.getSelectedItem().getId(), txPlaca.getText(), data,
                        cBoxCategoria.getSelectedItem(), cBoxProprietario.getSelectedItem(),
                        cBoxMarca.getSelectedItem(), cBoxMunicipio.getSelectedItem());
                VeiculoDAO dao = new VeiculoDAO(con);
                dao.update(veiculo);
                int input = JOptionPane.showConfirmDialog(null, "Registro efetuado,"
                        + " deseja fazer mais cadastros?");
                // 0= Sim, 1= Não
                System.out.println(input);
                if (input == 1) {
                    this.dispose();
                }
            } catch (ParseException ex) {
              JOptionPane.showMessageDialog(null, "Formato de data incorreto!", 
               "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnAtualizarRegistroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVeiculoActionPerformed
        GenericComboBoxModel<Veiculo> cBoxVeiculo = (GenericComboBoxModel<Veiculo>) cbVeiculo.getModel();
        txPlaca.setText(cBoxVeiculo.getSelectedItem().getPlaca());
        txAno.setText(String.valueOf(cBoxVeiculo.getSelectedItem().getAno()));
    }//GEN-LAST:event_cbVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new EditarVeiculos().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(EditarVeiculos.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarRegistro;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<Categoria> cbCategoria;
    private javax.swing.JComboBox<Marca> cbMarca;
    private javax.swing.JComboBox<Municipio> cbMunicipio;
    private javax.swing.JComboBox<Proprietario> cbProprietario;
    private javax.swing.JComboBox<Veiculo> cbVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblProprietario;
    private javax.swing.JTextField txAno;
    private javax.swing.JTextField txPlaca;
    // End of variables declaration//GEN-END:variables
}
