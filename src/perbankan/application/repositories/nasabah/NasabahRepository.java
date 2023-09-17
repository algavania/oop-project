/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.application.repositories.nasabah;

import perbankan.application.services.DatabaseService;
import perbankan.models.Bank;
import perbankan.models.Nasabah;
import perbankan.models.User;

/**
 *
 * @author MSI
 */
public class NasabahRepository implements BaseNasabahRepository {

    private final Bank bank = DatabaseService.getBank();

    @Override
    public void addNasabah(Nasabah nasabah) {
        bank.tambahNasabah(nasabah);
    }

    @Override
    public void editNasabah(int index, String namaAwal, String namaAkhir, User user) {
        bank.editNasabah(index, namaAwal, namaAkhir, user);
    }

    @Override
    public void deleteNasabah(int index) {
        bank.deleteNasabah(index);
    }

    @Override
    public Nasabah getNasabahByUsername(String username) {
        try {
            for (int i = 0; i < bank.getJumlahNasabah(); i++) {
                Nasabah nasabah = bank.getNasabah(i);
                User user = nasabah.getUser();
                if (user.getUsername().equals(username)) {
                    return nasabah;
                }
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public Nasabah getAccountNumber(String accountNumber) throws Exception {
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah nasabah = bank.getNasabah(i);
            if (nasabah.getNoRekening().equals(accountNumber)) {
                return nasabah;
            }
        }
        throw new Exception("Rekening tidak ditemukan!");
    }

}
