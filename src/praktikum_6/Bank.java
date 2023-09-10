/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class Bank {

    private List<Nasabah> nasabah;
    private int jumlahNasabah;

    public Bank() {
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        if (nasabah == null) {
            nasabah = new ArrayList();
        }
        nasabah.add(new Nasabah(namaAwal, namaAkhir));
        jumlahNasabah++;
    }
    
    public int getJumlahNasabah() {
        return nasabah.size();
    }
    
    public Nasabah getNasabah(int indeks) {
        return nasabah.get(indeks);
    }
}
