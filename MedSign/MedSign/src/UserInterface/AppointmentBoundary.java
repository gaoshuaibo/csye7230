/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AppointmentControl;
import DataManagement.DatabaseFactory;
import UserInterface.Login.LoginJPanel;
import java.awt.CardLayout;
import javax.swing.UIManager;

/**
 *
 * @author Alex
 */
public class AppointmentBoundary extends javax.swing.JFrame {

    AppointmentControl appointmentControl;

    /**
     * Creates new form MainJFrame
     */
    public AppointmentBoundary() {
        initComponents();
        setLocationRelativeTo(null);
        this.appointmentControl = DatabaseFactory.getInstance().retrieveSystem();
        if (AppointmentControl.isIsFirstTimeRunning()) {
            DatabaseFactory.getInstance().storeSystem();
        }

        LoginJPanel panel = new LoginJPanel(userProcessContainer, this);
        userProcessContainer.add("LoginJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 800));
        setResizable(false);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        getContentPane().add(userProcessContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AppointmentBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
                    UIManager.setLookAndFeel(lookAndFeel);
                } catch (Exception ex) {
                }
                new AppointmentBoundary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}