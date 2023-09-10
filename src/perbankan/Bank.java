/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

import praktikum_6.*;
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
    
    public void editNasabah(int index, String namaAwal, String namaAkhir) {
        Nasabah data = nasabah.get(index);
        data.setNamaAwal(namaAwal);
        data.setNamaAkhir(namaAkhir);
        nasabah.set(index, data);
    }
    
    public void deleteNasabah(int index) {
        nasabah.remove(index);
    }
    
    public int getJumlahNasabah() {
        return nasabah.size();
    }
    
    public Nasabah getNasabah(int indeks) {
        return nasabah.get(indeks);
    }

    public List<perbankan.Nasabah> getNasabah() {
        return nasabah;
    }
}
