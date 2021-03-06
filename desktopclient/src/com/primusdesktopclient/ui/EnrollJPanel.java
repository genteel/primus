/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primusdesktopclient.ui;

import com.primusdesktopclient.gsondata.Lecturer;
import com.primusdesktopclient.service.UIService;
import javax.swing.JOptionPane;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author Ocheja Patrick Ileanwa
 */
public class EnrollJPanel extends javax.swing.JPanel {

    private static final Logger log = Logger.getLogger(EnrollJPanel.class);
    private String lecturerID;

    /**
     * Creates new form EnrollJPanel
     */
    public EnrollJPanel() {
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
        lecturerSearchTF = new javax.swing.JTextField();
        lecturerSearchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        moduleLocation = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setText("Enter Lecturer's Name or Email");

        lecturerSearchBtn.setText("Search");
        lecturerSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerSearchBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ENROLL A NEW LECTURER'S FINGERPRINT");

        jLabel3.setText("Name:");

        fullName.setEnabled(false);

        jLabel4.setText("Department:");

        department.setEnabled(false);

        email.setEnabled(false);

        jLabel5.setText("Email:");

        jLabel6.setText("Module Location:");

        moduleLocation.setModel(new javax.swing.DefaultComboBoxModel(new UIService().getAllScanners().toArray()));

        jButton1.setText("ENROLL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lecturerSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lecturerSearchBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(53, 53, 53)
                                        .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(moduleLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lecturerSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecturerSearchBtn))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(moduleLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lecturerSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerSearchBtnActionPerformed
        // TODO add your handling code here:
        fullName.setText("");
        department.setText("");
        email.setText("");
        Lecturer lecturer = new Lecturer();
        UIService service = new UIService();
        String searchStr = lecturerSearchTF.getText();
        if (searchStr != null && !searchStr.isEmpty()) {
            try {
                lecturer = service.getLecturer(searchStr);
            } catch (Exception ex) {
                log.error(Level.ERROR, ex);
            }
            if (lecturer.getLecturerID() == null) {
                JOptionPane.showMessageDialog(this, "No lecturer found");
            } else {
                lecturerID = lecturer.getLecturerID();
                fullName.setText(lecturer.getName());
                department.setText(lecturer.getDepartmentName());
                email.setText(lecturer.getEmailAddress());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please fill the text field.");
        }

    }//GEN-LAST:event_lecturerSearchBtnActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
        MainWindow.runnables();
    }//GEN-LAST:event_formComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("thread is "+MainWindow.thread );
        if (MainWindow.thread != null) {
            MainWindow.runnable.terminate();
            try {
                MainWindow.thread.join();
                System.out.println("Thread successfully stopped.");
                Thread.sleep(1000); // wait for io port to settle
            } catch (InterruptedException ex) {
                log.error(Level.ERROR, ex);
            }
        }
        if (lecturerID != null && moduleLocation.getSelectedItem() != null) {
            boolean status = new UIService().registerLecturer((String) moduleLocation.getSelectedItem(), Long.valueOf(lecturerID));
            if (status) {
                lecturerID = null;
                JOptionPane.showMessageDialog(this, "Lecturer Successfully enrolled.");
            } else {
                JOptionPane.showMessageDialog(this, "Error enrolling, please try again.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid details, you must select a lecturer and/or module location.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField department;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton lecturerSearchBtn;
    private javax.swing.JTextField lecturerSearchTF;
    private javax.swing.JComboBox moduleLocation;
    // End of variables declaration//GEN-END:variables
}
