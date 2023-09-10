/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perbankan;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author MSI
 */
public class ManageNasabahView extends javax.swing.JFrame {

    private final Bank bank;
    private NasabahListTableModel tableModel;
    private boolean isEdit = false;
    private boolean isSelectionUserEvent = false;

    /**
     * Creates new form ManageNasabahView
     */
    public ManageNasabahView() {
        bank = new Bank();
        tableModel = new NasabahListTableModel(bank.getNasabah());
        initComponents();
        nasabahListTable.setModel(tableModel);
        ListSelectionModel list = nasabahListTable.getSelectionModel();
        setEditingMode();
        // Listen to row selection
        list.addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting() && !isSelectionUserEvent) {
                isEdit = true;
                int selectedRow = nasabahListTable.getSelectedRow();
                if (selectedRow != -1) {
                    Nasabah data = tableModel.getNasabahAt(selectedRow);
                    tfFirstName.setText(data.getNamaAwal());
                    tfLastName.setText(data.getNamaAkhir());
                }
                setEditingMode();
            }
        });
    }

    private void setEditingMode() {
        btnNasabahAction.setText(isEdit ? "Ubah" : "Tambah");
        btnCancelNasabah.setVisible(isEdit);
        btnDeleteNasabah.setVisible(isEdit);
        if (!isEdit) {
            clearTextFields();
            isSelectionUserEvent = true;
            nasabahListTable.clearSelection();
            isSelectionUserEvent = false;
        }
    }

    private void clearTextFields() {
        tfFirstName.setText("");
        tfLastName.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        btnNasabahAction = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nasabahListTable = new javax.swing.JTable();
        btnCancelNasabah = new javax.swing.JButton();
        btnDeleteNasabah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manajemen Nasabah");

        jLabel2.setText("Nama Awal");

        jLabel3.setText("Nama Akhir");

        btnNasabahAction.setText("Tambah");
        btnNasabahAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNasabahActionActionPerformed(evt);
            }
        });

        nasabahListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(nasabahListTable);

        btnCancelNasabah.setText("Batal");
        btnCancelNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNasabahActionPerformed(evt);
            }
        });

        btnDeleteNasabah.setText("Hapus");
        btnDeleteNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNasabahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNasabahAction)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteNasabah)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNasabahAction, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnDeleteNasabah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelNasabah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNasabahActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNasabahActionActionPerformed
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Field harus diisi!");
            return;
        }
        if (isEdit) {
            int index = nasabahListTable.getSelectedRow();
            bank.editNasabah(index, firstName, lastName);
            tableModel.editNasabah(index, bank.getNasabah(index));
        } else {
            bank.tambahNasabah(firstName, lastName);
            tableModel.addNasabah(bank.getNasabah(bank.getJumlahNasabah() - 1));
            clearTextFields();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNasabahActionActionPerformed

    private void btnCancelNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNasabahActionPerformed
        isEdit = false;
        setEditingMode();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelNasabahActionPerformed

    private void btnDeleteNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNasabahActionPerformed
        int index = nasabahListTable.getSelectedRow();
        bank.deleteNasabah(index);
        tableModel.deleteNasabah(index);
        isEdit = false;
        setEditingMode();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteNasabahActionPerformed

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
            java.util.logging.Logger.getLogger(ManageNasabahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageNasabahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageNasabahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageNasabahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageNasabahView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelNasabah;
    private javax.swing.JButton btnDeleteNasabah;
    private javax.swing.JButton btnNasabahAction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nasabahListTable;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    // End of variables declaration//GEN-END:variables
}
