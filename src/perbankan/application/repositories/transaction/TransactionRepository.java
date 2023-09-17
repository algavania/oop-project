/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.application.repositories.transaction;

import perbankan.models.Nasabah;

/**
 *
 * @author MSI
 */
public class TransactionRepository implements BaseTransactionRepository {

    @Override
    public void withdraw(Nasabah nasabah, int amount) throws Exception {
        boolean res = nasabah.getTabungan().ambilUang(amount);
        if (!res) {
            throw new Exception("Saldo tidak cukup!");
        }
    }

    @Override
    public void deposit(Nasabah nasabah, int amount) {
        nasabah.getTabungan().simpanUang(amount);
    }

    @Override
    public void transfer(Nasabah sender, Nasabah receiver, int amount) throws Exception {
        boolean status = sender.getTabungan().ambilUang(amount);
        if (!status) {
            throw new Exception("Saldo tidak cukup!");
        }
        receiver.getTabungan().simpanUang(amount);
    }


}
