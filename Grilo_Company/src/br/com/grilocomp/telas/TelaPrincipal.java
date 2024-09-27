/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.grilocomp.telas;

import br.com.grilocomp.dal.ModuloConexao;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author 55349
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        menuCadCli = new javax.swing.JMenuItem();
        menuCadOs = new javax.swing.JMenuItem();
        menuCadUsu = new javax.swing.JMenuItem();
        menuRel = new javax.swing.JMenu();
        menRelCli = new javax.swing.JMenuItem();
        menuRelServ = new javax.swing.JMenuItem();
        menuAju = new javax.swing.JMenu();
        menuAjuSob = new javax.swing.JMenuItem();
        menuOp = new javax.swing.JMenu();
        menuOpSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grilo Sistemas - Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(600, 616));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblData.setText("Data");

        menuCad.setText("Cadastro");

        menuCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadCli.setText("Cliente");
        menuCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCliActionPerformed(evt);
            }
        });
        menuCad.add(menuCadCli);

        menuCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadOs.setText("OS");
        menuCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadOsActionPerformed(evt);
            }
        });
        menuCad.add(menuCadOs);

        menuCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadUsu.setText("Usuário");
        menuCadUsu.setEnabled(false);
        menuCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUsuActionPerformed(evt);
            }
        });
        menuCad.add(menuCadUsu);

        menu.add(menuCad);

        menuRel.setText("Relatório");
        menuRel.setEnabled(false);
        menuRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelActionPerformed(evt);
            }
        });

        menRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menRelCli.setText("Clientes");
        menRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelCliActionPerformed(evt);
            }
        });
        menuRel.add(menRelCli);

        menuRelServ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuRelServ.setText("Serviços");
        menuRelServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelServActionPerformed(evt);
            }
        });
        menuRel.add(menuRelServ);

        menu.add(menuRel);

        menuAju.setText("Ajuda");

        menuAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuAjuSob.setText("Sobre");
        menuAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjuSobActionPerformed(evt);
            }
        });
        menuAju.add(menuAjuSob);

        menu.add(menuAju);

        menuOp.setText("Opções");

        menuOpSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuOpSair.setText("Sair");
        menuOpSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpSairActionPerformed(evt);
            }
        });
        menuOp.add(menuOpSair);

        menu.add(menuOp);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblData))
                .addGap(0, 107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblUsuario)
                .addGap(37, 37, 37)
                .addComponent(lblData)
                .addContainerGap(468, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(854, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Inserindo data na tela principal
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menuOpSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpSairActionPerformed
        // Exibir uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuOpSairActionPerformed

    private void menuAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjuSobActionPerformed
        // Tela Sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menuAjuSobActionPerformed

    private void menuCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUsuActionPerformed
        // Abrir tela usuario no desktop (TelaPrincipal)
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_menuCadUsuActionPerformed

    private void menuCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadCliActionPerformed
        // Chama a tela de cliente
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_menuCadCliActionPerformed

    private void menuCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadOsActionPerformed
        // Chama a tela de OS
        TelaOS os = new TelaOS();
        os.setVisible(true);
        desktop.add(os);
    }//GEN-LAST:event_menuCadOsActionPerformed

    private void menuRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelActionPerformed

    private void menRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelCliActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        
        if (confirma == JOptionPane.YES_OPTION) {
            
            try {
                
                JasperPrint print = JasperFillManager.fillReport("C:/Users/55349/Relatorios/clientes.jasper", null,conexao);
                JasperViewer.viewReport(print, false);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_menRelCliActionPerformed

    private void menuRelServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelServActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        
        if (confirma == JOptionPane.YES_OPTION) {
            
            try {
                
                JasperPrint print = JasperFillManager.fillReport("C:/Users/55349/Relatorios/servicos.jasper", null,conexao);
                JasperViewer.viewReport(print, false);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_menuRelServActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException {
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
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menRelCli;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAju;
    private javax.swing.JMenuItem menuAjuSob;
    private javax.swing.JMenu menuCad;
    private javax.swing.JMenuItem menuCadCli;
    private javax.swing.JMenuItem menuCadOs;
    public static javax.swing.JMenuItem menuCadUsu;
    private javax.swing.JMenu menuOp;
    private javax.swing.JMenuItem menuOpSair;
    public static javax.swing.JMenu menuRel;
    private javax.swing.JMenuItem menuRelServ;
    // End of variables declaration//GEN-END:variables

    private static class ClassNotFoundExceptiontion {

        public ClassNotFoundExceptiontion() {
        }
    }
}
