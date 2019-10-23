/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVeiculo = new javax.swing.JMenu();
        menuestado = new javax.swing.JMenuItem();
        menuMunicipio = new javax.swing.JMenuItem();
        menuMarca = new javax.swing.JMenuItem();
        menuCategoria = new javax.swing.JMenuItem();
        menuProprietario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuListarProprietario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuEditarEstados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setText("Sistema Cadastro");

        menuVeiculo.setText("Cadastros");

        menuestado.setText("Cadastrar Estado");
        menuestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuestadoActionPerformed(evt);
            }
        });
        menuVeiculo.add(menuestado);

        menuMunicipio.setText("Cadastrar Município");
        menuMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMunicipioActionPerformed(evt);
            }
        });
        menuVeiculo.add(menuMunicipio);

        menuMarca.setText("Cadastrar Marca");
        menuMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMarcaActionPerformed(evt);
            }
        });
        menuVeiculo.add(menuMarca);

        menuCategoria.setText("Cadastrar Categoria");
        menuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaActionPerformed(evt);
            }
        });
        menuVeiculo.add(menuCategoria);

        menuProprietario.setText("Cadastrar Proprietário");
        menuProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProprietarioActionPerformed(evt);
            }
        });
        menuVeiculo.add(menuProprietario);

        jMenuItem1.setText("Cadastrar Veículo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuVeiculo.add(jMenuItem1);

        jMenuBar1.add(menuVeiculo);

        jMenu2.setText("Consultas");

        jMenuItem6.setText("Consultar/Apagar Veículos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        menuListarProprietario.setText("Consultar/Apagar Proprietários");
        menuListarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarProprietarioActionPerformed(evt);
            }
        });
        jMenu2.add(menuListarProprietario);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Editar");

        menuEditarEstados.setText("Editar Estados");
        menuEditarEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarEstadosActionPerformed(evt);
            }
        });
        jMenu1.add(menuEditarEstados);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuestadoActionPerformed
      CadastrarEstado estado = new CadastrarEstado();
      estado.setVisible(true);
    }//GEN-LAST:event_menuestadoActionPerformed

    private void menuMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMunicipioActionPerformed
        try {
            CadastrarMunicipio municipio = new CadastrarMunicipio();
            municipio.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuMunicipioActionPerformed

    private void menuMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMarcaActionPerformed
       CadastrarMarca marca = new CadastrarMarca();
       marca.setVisible(true);
    }//GEN-LAST:event_menuMarcaActionPerformed

    private void menuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaActionPerformed
      CadastrarCategoria categoria = new CadastrarCategoria();
      categoria.setVisible(true);
    }//GEN-LAST:event_menuCategoriaActionPerformed

    private void menuProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProprietarioActionPerformed
      CadastrarProprietario proprietario = new CadastrarProprietario();
      proprietario.setVisible(true);
    }//GEN-LAST:event_menuProprietarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            CadastrarVeiculo veiculo = new CadastrarVeiculo();
            veiculo.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ListarApagarVeiculos listar = new ListarApagarVeiculos();
        listar.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menuListarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarProprietarioActionPerformed
       ListarApagarProprietarios listarP = new ListarApagarProprietarios();
       listarP.setVisible(true);
    }//GEN-LAST:event_menuListarProprietarioActionPerformed

    private void menuEditarEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEditarEstadosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem menuCategoria;
    private javax.swing.JMenuItem menuEditarEstados;
    private javax.swing.JMenuItem menuListarProprietario;
    private javax.swing.JMenuItem menuMarca;
    private javax.swing.JMenuItem menuMunicipio;
    private javax.swing.JMenuItem menuProprietario;
    private javax.swing.JMenu menuVeiculo;
    private javax.swing.JMenuItem menuestado;
    // End of variables declaration//GEN-END:variables
}