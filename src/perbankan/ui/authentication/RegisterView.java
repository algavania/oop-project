/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package perbankan.ui.authentication;

import perbankan.application.repositories.auth.AuthRepository;
import javax.swing.JOptionPane;
import perbankan.InjectionContainer;
import perbankan.ui.MainFrame;

/**
 *
 * @author MSI
 */
public class RegisterView extends javax.swing.JPanel {

    private final MainFrame mainFrame;
    private final AuthRepository repository;

    /**
     * Creates new form RegisterView
     *
     * @param mainFrame
     */
    public RegisterView(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        repository = InjectionContainer.authRepository;
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

        Register = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsernameRegister = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPasswordRegister = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtRedirectRegister = new javax.swing.JLabel();

        Register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Register.setText("Register");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel4.setText("Sudah punya akun?");

        txtRedirectRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRedirectRegister.setText("Masuk");
        txtRedirectRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRedirectRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRedirectRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Register))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsernameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRedirectRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Register)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUsernameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRedirectRegister))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String username = tfUsernameRegister.getText();
        String password = String.valueOf(tfPasswordRegister.getPassword());
        if (username.trim().isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field harus diisi!");
            return;
        }
        try {
            repository.register(username, password, "User");
            JOptionPane.showMessageDialog(this, "Akun berhasil didaftarkan!");
            mainFrame.showView(new LoginView(mainFrame));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtRedirectRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRedirectRegisterMouseClicked
        mainFrame.showView(new LoginView(mainFrame));
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedirectRegisterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Register;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField tfPasswordRegister;
    private javax.swing.JTextField tfUsernameRegister;
    private javax.swing.JLabel txtRedirectRegister;
    // End of variables declaration//GEN-END:variables
}
