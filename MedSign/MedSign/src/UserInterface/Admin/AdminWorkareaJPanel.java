/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin;

import Business.AppointmentControl;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class AdminWorkareaJPanel extends javax.swing.JPanel {

    AppointmentControl appointmentControl;
    private JPanel userProcessContainer;
    private javax.swing.JFrame parent;

    /**
     * Creates new form AdminWorkareaJPanel
     */
    public AdminWorkareaJPanel(JPanel userProcessContainer, javax.swing.JFrame parent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.parent = parent;
        appointmentControl = AppointmentControl.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btManageUserAccount = new javax.swing.JButton();
        btManageAppointment = new javax.swing.JButton();
        btLogoff = new javax.swing.JButton();

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 10, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        btManageUserAccount.setText("View User Account");
        btManageUserAccount.setMaximumSize(new java.awt.Dimension(150, 23));
        btManageUserAccount.setMinimumSize(new java.awt.Dimension(150, 23));
        btManageUserAccount.setPreferredSize(new java.awt.Dimension(150, 23));
        btManageUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageUserAccountActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btManageUserAccount, gridBagConstraints);

        btManageAppointment.setText("View Appointment");
        btManageAppointment.setMaximumSize(new java.awt.Dimension(150, 23));
        btManageAppointment.setMinimumSize(new java.awt.Dimension(150, 23));
        btManageAppointment.setPreferredSize(new java.awt.Dimension(150, 23));
        btManageAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageAppointmentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btManageAppointment, gridBagConstraints);

        btLogoff.setText("Logoff");
        btLogoff.setMaximumSize(new java.awt.Dimension(150, 23));
        btLogoff.setMinimumSize(new java.awt.Dimension(150, 23));
        btLogoff.setPreferredSize(new java.awt.Dimension(150, 23));
        btLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoffActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel1.add(btLogoff, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJDialog jdialog = new ManageUserAccountJDialog(parent, true);
        jdialog.setVisible(true);

    }//GEN-LAST:event_btManageUserAccountActionPerformed

    private void btManageAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageAppointmentActionPerformed
        // TODO add your handling code here:
        ManageAppointmentJDialog jdialog = new ManageAppointmentJDialog(parent, true);
        jdialog.setVisible(true);
    }//GEN-LAST:event_btManageAppointmentActionPerformed

    private void btLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoffActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btLogoffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogoff;
    private javax.swing.JButton btManageAppointment;
    private javax.swing.JButton btManageUserAccount;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
