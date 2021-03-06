/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkarea;

import Business.Appointment.Appointment;
import Business.Person.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class ViewDoctorAppointmentJDialog extends javax.swing.JDialog {

    private Appointment appointment;
    private ArrayList<Doctor> doctorList;

    /**
     * Creates new form ViewDoctorAppointmentJDialog
     */
    public ViewDoctorAppointmentJDialog(javax.swing.JFrame parent, boolean modal, Appointment appointment, ArrayList<Doctor> doctorList) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.appointment = appointment;
        this.doctorList = doctorList;
        txtId.setText(String.valueOf(appointment.getId()));
        populateIllnessType();
        populateDateTime();
        populateStatus();
        populateDoctor();
        txtDescription.setText(appointment.getDescription());
    }

    private void populateIllnessType() {
        cbIllnessType.removeAllItems();
        for (Appointment.IllnessType type : Appointment.IllnessType.values()) {
            cbIllnessType.addItem(type);
        }
        cbIllnessType.setSelectedItem(appointment.getIllnessType());
    }

    private void populateDateTime() {
        //spinnerDateTime.setModel(appointment.getDateTime());
        spinnerDateTime.setValue(appointment.getDateTime());
    }

    private void populateStatus() {
        cbStatus.removeAllItems();
        for (Appointment.StatusType status : Appointment.StatusType.values()) {
            cbStatus.addItem(status);
        }
        cbStatus.setSelectedItem(appointment.getStatus());
    }

    private void populateDoctor() {
        cbDoctor.removeAllItems();
        for (Doctor doctor : doctorList) {
            cbDoctor.addItem(doctor);
        }
        cbDoctor.setSelectedItem(appointment.getDoctor());
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbIllnessType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinnerDateTime = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cbDoctor = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 10, 0};
        jPanel2Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel2.setLayout(jPanel2Layout);

        jLabel1.setText("Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jLabel1, gridBagConstraints);

        txtId.setEnabled(false);
        txtId.setMaximumSize(new java.awt.Dimension(200, 20));
        txtId.setMinimumSize(new java.awt.Dimension(200, 20));
        txtId.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(txtId, gridBagConstraints);

        jLabel2.setText("Illness Type:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jLabel2, gridBagConstraints);

        cbIllnessType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbIllnessType.setEnabled(false);
        cbIllnessType.setMaximumSize(new java.awt.Dimension(200, 20));
        cbIllnessType.setMinimumSize(new java.awt.Dimension(200, 20));
        cbIllnessType.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(cbIllnessType, gridBagConstraints);

        jLabel3.setText("Description:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Date/Time:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jLabel4, gridBagConstraints);

        spinnerDateTime.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1416968326988L), null, null, java.util.Calendar.DAY_OF_MONTH));
        spinnerDateTime.setEnabled(false);
        spinnerDateTime.setMaximumSize(new java.awt.Dimension(200, 20));
        spinnerDateTime.setMinimumSize(new java.awt.Dimension(200, 20));
        spinnerDateTime.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(spinnerDateTime, gridBagConstraints);

        jLabel5.setText("Status:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jLabel5, gridBagConstraints);

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbStatus.setEnabled(false);
        cbStatus.setMaximumSize(new java.awt.Dimension(200, 20));
        cbStatus.setMinimumSize(new java.awt.Dimension(200, 20));
        cbStatus.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(cbStatus, gridBagConstraints);

        jLabel6.setText("Doctor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jLabel6, gridBagConstraints);

        cbDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDoctor.setEnabled(false);
        cbDoctor.setMaximumSize(new java.awt.Dimension(200, 20));
        cbDoctor.setMinimumSize(new java.awt.Dimension(200, 20));
        cbDoctor.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(cbDoctor, gridBagConstraints);

        jScrollPane1.setEnabled(false);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 100));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.setEnabled(false);
        txtDescription.setMaximumSize(new java.awt.Dimension(200, 100));
        txtDescription.setMinimumSize(new java.awt.Dimension(200, 100));
        txtDescription.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(txtDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbDoctor;
    private javax.swing.JComboBox cbIllnessType;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerDateTime;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
