/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package perbankan.ui.transaksi;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import perbankan.application.repositories.transaction.TransactionRepository;
import perbankan.application.services.DatabaseService;
import java.text.NumberFormat;
import java.util.Currency;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import perbankan.models.Nasabah;
import perbankan.models.User;
import perbankan.ui.MainFrame;
import perbankan.ui.authentication.LoginView;
import perbankan.ui.nasabah.NasabahView;

/**
 *
 * @author MSI
 */
public class TransaksiView extends javax.swing.JPanel {

    private final MainFrame mainFrame;
    private final TransactionRepository repository;
    private final Nasabah nasabah;
    private final NumberFormat format;
    private final User currentUser;

    /**
     * Creates new form TransaksiView
     *
     * @param mainFrame
     * @param nasabah
     */
    public TransaksiView(MainFrame mainFrame, Nasabah nasabah) {
        this.mainFrame = mainFrame;
        this.nasabah = nasabah;
        currentUser = DatabaseService.getCurrentUser();
        repository = new TransactionRepository();
        DatabaseService.getBank();
        initComponents();
        ((AbstractDocument) tfAmount.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        if ("User".equals(currentUser.getRole())) {
            btnBack.setText("Logout");
        }
        format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(0);
        format.setCurrency(Currency.getInstance("IDR"));
        txtAccountNumber.setText(nasabah.getNoRekening());
        txtFullName.setText(nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());
        updateBalanceUi();
    }

    private int getAmountValue() {
        String defaultAmount = tfAmount.getText();
        String amountText = defaultAmount.replaceAll("\\,", "");
        return amountText.isBlank() ? 0 : Integer.parseInt(amountText);
    }

    private void updateBalanceUi() {
        txtBalance.setText("Rp" + format.format(nasabah.getTabungan().getSaldo()));
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
        txtFullName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JLabel();
        tfAmount = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JLabel();
        btnCopy = new javax.swing.JButton();
        btnWithdraw1 = new javax.swing.JButton();

        jLabel1.setText("Nama Lengkap");

        txtFullName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFullName.setText("User");

        jLabel2.setText("Saldo");

        txtBalance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBalance.setText("Rp0");

        tfAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAmountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAmountKeyReleased(evt);
            }
        });

        btnWithdraw.setText("Tarik Tunai");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnDeposit.setText("Tabung");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setText("Nomor Rekening");

        txtAccountNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAccountNumber.setText("1234567891");

        btnCopy.setText("Salin");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        btnWithdraw1.setText("Transfer");
        btnWithdraw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdraw1ActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAccountNumber)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCopy))
                                    .addComponent(txtBalance)
                                    .addComponent(txtFullName)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnWithdraw1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAccountNumber)
                    .addComponent(btnCopy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBalance))
                .addGap(18, 18, 18)
                .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnWithdraw1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (currentUser.getRole().equals("User")) {
            mainFrame.showView(new LoginView(mainFrame));
        } else {
            mainFrame.showView(new NasabahView(mainFrame));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnWithdraw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdraw1ActionPerformed
        mainFrame.showView(new TransferView(mainFrame, nasabah));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWithdraw1ActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        int amount = getAmountValue();
        String defaultAmount = tfAmount.getText();
        if (amount != 0) {
            repository.deposit(nasabah, amount);
            updateBalanceUi();
            JOptionPane.showMessageDialog(this, "Berhasil menyimpan Rp" + defaultAmount);
            tfAmount.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        try {
            int amount = getAmountValue();
            String defaultAmount = tfAmount.getText();
            if (amount != 0) {
                repository.withdraw(nasabah, amount);
                updateBalanceUi();
                JOptionPane.showMessageDialog(this, "Berhasil mengambil Rp" + defaultAmount);
                tfAmount.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        String accountNumber = txtAccountNumber.getText();
        StringSelection stringSelection = new StringSelection(accountNumber);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(this, accountNumber + " berhasil disalin");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JButton btnWithdraw1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JLabel txtAccountNumber;
    private javax.swing.JLabel txtBalance;
    private javax.swing.JLabel txtFullName;
    // End of variables declaration//GEN-END:variables
}
