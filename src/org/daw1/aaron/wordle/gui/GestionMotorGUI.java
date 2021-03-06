/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.daw1.aaron.wordle.gui;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.daw1.aaron.wordle.gestionWordle.GestionWordle;



/**
 *
 * @author mozop
 */
public class GestionMotorGUI extends javax.swing.JDialog {
    private static final Pattern PATRON_INPUT = Pattern.compile("[A-Z]{5}");
    private static final java.awt.Color  COLOR_VERDE = new java.awt.Color(0, 102, 0);
    private static final java.awt.Color  COLOR_ROJO = new java.awt.Color(255 ,0, 51);
    
    private static GestionWordle gestion;

    /**
     * Creates new form GestionMotorGUI
     */
    public GestionMotorGUI(java.awt.Frame parent, boolean modal, GestionWordle gestiones) {
        super(parent, modal);
        initComponents();
        this.gestion = gestiones;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainjPanel = new javax.swing.JPanel();
        cuerpojPanel = new javax.swing.JPanel();
        anadirjPanel = new javax.swing.JPanel();
        insertarjPanel = new javax.swing.JPanel();
        anadirjTextField = new javax.swing.JTextField();
        anadirjButton = new javax.swing.JButton();
        estadojPanel = new javax.swing.JPanel();
        estadoInsertarjLabel = new javax.swing.JLabel();
        borrarjPanel = new javax.swing.JPanel();
        borradojPanel = new javax.swing.JPanel();
        borrarjTextField = new javax.swing.JTextField();
        borrarButton = new javax.swing.JButton();
        estadoBorradojPanel = new javax.swing.JPanel();
        estadoBorradojLabel = new javax.swing.JLabel();
        titulojPanel = new javax.swing.JPanel();
        titulojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        mainjPanel.setLayout(new java.awt.BorderLayout());

        cuerpojPanel.setLayout(new java.awt.GridLayout(2, 1));

        anadirjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        anadirjPanel.setLayout(new java.awt.GridLayout(2, 1));

        anadirjTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        anadirjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirjTextFieldActionPerformed(evt);
            }
        });
        insertarjPanel.add(anadirjTextField);

        anadirjButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        anadirjButton.setText("A??adir");
        anadirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirjButtonActionPerformed(evt);
            }
        });
        insertarjPanel.add(anadirjButton);

        anadirjPanel.add(insertarjPanel);

        estadojPanel.setLayout(new java.awt.GridBagLayout());
        estadojPanel.add(estadoInsertarjLabel, new java.awt.GridBagConstraints());

        anadirjPanel.add(estadojPanel);

        cuerpojPanel.add(anadirjPanel);

        borrarjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12)))); // NOI18N
        borrarjPanel.setLayout(new java.awt.GridLayout(2, 1));

        borrarjTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        borradojPanel.add(borrarjTextField);

        borrarButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        borrarButton.setText("Borrar");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        borradojPanel.add(borrarButton);

        borrarjPanel.add(borradojPanel);

        estadoBorradojPanel.setLayout(new java.awt.GridBagLayout());
        estadoBorradojPanel.add(estadoBorradojLabel, new java.awt.GridBagConstraints());

        borrarjPanel.add(estadoBorradojPanel);

        cuerpojPanel.add(borrarjPanel);

        mainjPanel.add(cuerpojPanel, java.awt.BorderLayout.CENTER);

        titulojPanel.setLayout(new java.awt.GridBagLayout());

        titulojLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        titulojLabel.setForeground(new java.awt.Color(0, 0, 0));
        titulojLabel.setText("Gesti??n Motor");
        titulojPanel.add(titulojLabel, new java.awt.GridBagConstraints());
        titulojLabel.getAccessibleContext().setAccessibleName("Gestion Motor");

        mainjPanel.add(titulojPanel, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anadirjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirjTextFieldActionPerformed

    }//GEN-LAST:event_anadirjTextFieldActionPerformed

    private void anadirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirjButtonActionPerformed
        String input = this.anadirjTextField.getText().toUpperCase();
        if(PATRON_INPUT.matcher(input).matches()){
            try {
                if(gestion.exitePalabra(input)){
                    this.estadoInsertarjLabel.setForeground(COLOR_ROJO);
                    this.estadoInsertarjLabel.setText("La palabra ya existe");
                }else{
                    gestion.anhadirPalabra(input);
                    this.estadoInsertarjLabel.setForeground(COLOR_VERDE);
                    this.estadoInsertarjLabel.setText("La palabra se inserto perfectamente");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al anadir la palabra: " + ex.getMessage());
            }
        }else{
            this.estadoInsertarjLabel.setForeground(COLOR_ROJO);
            this.estadoInsertarjLabel.setText("Palabra invalida no est?? formada por [A-Z]{5}");

        }
        this.anadirjTextField.setText("");
        this.estadoBorradojLabel.setText("");
    }//GEN-LAST:event_anadirjButtonActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        String input = this.borrarjTextField.getText().toUpperCase();
        if(PATRON_INPUT.matcher(input).matches()){
            try {
                if(gestion.exitePalabra(input)){
                    gestion.borrarPalabra(input);
                    this.estadoBorradojLabel.setForeground(COLOR_VERDE);
                    this.estadoBorradojLabel.setText("La palabra se ha borrado perfectamente");

                }else{
                    this.estadoBorradojLabel.setForeground(COLOR_ROJO);
                    this.estadoBorradojLabel.setText("La palabra no existe");

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al borrar la palabra: " + ex.getMessage());
            }
            
        }else{
            this.estadoBorradojLabel.setForeground(COLOR_ROJO);
            this.estadoBorradojLabel.setText("Palabra invalida no est?? formada por [A-Z]{5}");
        }
        this.borrarjTextField.setText("");
        this.estadoInsertarjLabel.setText("");
    }//GEN-LAST:event_borrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionMotorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMotorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMotorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMotorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionMotorGUI dialog = new GestionMotorGUI(new javax.swing.JFrame(), true,gestion);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadirjButton;
    private javax.swing.JPanel anadirjPanel;
    private javax.swing.JTextField anadirjTextField;
    private javax.swing.JPanel borradojPanel;
    private javax.swing.JButton borrarButton;
    private javax.swing.JPanel borrarjPanel;
    private javax.swing.JTextField borrarjTextField;
    private javax.swing.JPanel cuerpojPanel;
    private javax.swing.JLabel estadoBorradojLabel;
    private javax.swing.JPanel estadoBorradojPanel;
    private javax.swing.JLabel estadoInsertarjLabel;
    private javax.swing.JPanel estadojPanel;
    private javax.swing.JPanel insertarjPanel;
    private javax.swing.JPanel mainjPanel;
    private javax.swing.JLabel titulojLabel;
    private javax.swing.JPanel titulojPanel;
    // End of variables declaration//GEN-END:variables
}
