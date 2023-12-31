/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package perbankan.ui.transaksi;

import java.text.NumberFormat;
import java.util.Currency;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import perbankan.InjectionContainer;
import perbankan.application.repositories.nasabah.NasabahRepository;
import perbankan.application.repositories.transaction.TransactionRepository;
import perbankan.application.services.DatabaseService;
import perbankan.models.Nasabah;
import perbankan.ui.MainFrame;

/**
 *
 * @author MSI
 */
public class TransferView extends javax.swing.JPanel {

    private final MainFrame mainFrame;
    private final TransactionRepository repository;
    private final NasabahRepository nasabahRepository;
    private final Nasabah sender;
    private Nasabah receiver;
    private final NumberFormat format;

    /**
     * Creates new form TransferView
     *
     * @param mainFrame
     * @param nasabah
     */
    public TransferView(MainFrame mainFrame, Nasabah nasabah) {
        this.mainFrame = mainFrame;
        sender = nasabah;
        repository = InjectionContainer.transactionRepository;
        nasabahRepository = InjectionContainer.nasabahRepository;
        DatabaseService.getBank();
        initComponents();
        ((AbstractDocument) tfAmount.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(0);
        format.setCurrency(Currency.getInstance("IDR"));
        txtReceiverName.setText("Penerima");
    }

    private int getAmountValue() {
        String defaultAmount = tfAmount.getText();
        String amountText = defaultAmount.replaceAll("\\,", "");
        return amountText.isBlank() ? 0 : Integer.parseInt(amountText);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        tfAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfAccountNumber = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtReceiverName = new javax.swing.JLabel();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        tfAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAmountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAmountKeyReleased(evt);
            }
        });

        jLabel2.setText("No Rekening");

        btnCheck.setText("Periksa");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Penerima");

        txtReceiverName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtReceiverName.setText("Penerima");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCheck))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(16, 16, 16)
                                .addComponent(txtReceiverName))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceiverName)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new TransaksiView(mainFrame, sender));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        String receiverName = txtReceiverName.getText();
        String defaultAmount = tfAmount.getText();
        if (receiver == null) {
            JOptionPane.showMessageDialog(this, "Isi dulu nomor rekeningnya!");
        } else {
            try {
                repository.transfer(sender, receiver, getAmountValue());
                JOptionPane.showMessageDialog(this,
                        "Berhasil transfer sebesar Rp" + defaultAmount
                        + " ke " + receiverName);
                tfAmount.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferActionPerformed

    private void tfAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAmountKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmountKeyPressed

    private void tfAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAmountKeyReleased

        if (evt.getKeyChar() == ',') {
            String text = tfAmount.getText();
            text = text.substring(0, text.lastIndexOf(','));
            tfAmount.setText(text);
        } else {
            String amountText = tfAmount.getText().replaceAll("\\,", "");
            if (amountText.isEmpty()) {
                tfAmount.setText("");
            } else {
                double amount = Double.parseDouble(amountText);
                tfAmount.setText(format.format(amount));
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmountKeyReleased

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        String accountNumber = tfAccountNumber.getText().trim();
        try {
            receiver = nasabahRepository.getAccountNumber(accountNumber);
            if (receiver.getNoRekening().equals(sender.getNoRekening())) {
                receiver = null;
                JOptionPane.showMessageDialog(this, "Tidak bisa mengirim ke rekening sendiri!");
            } else {
                txtReceiverName.setText(receiver.getNamaAwal()+" "+receiver.getNamaAkhir());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfAccountNumber;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JLabel txtReceiverName;
    // End of variables declaration//GEN-END:variables
}
