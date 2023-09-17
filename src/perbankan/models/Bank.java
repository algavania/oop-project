/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.models;

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

    public void tambahNasabah(Nasabah data) {
        data.setTabungan(new Tabungan(0));
        if (nasabah == null) {
            nasabah = new ArrayList();
        }
        nasabah.add(data);
        jumlahNasabah++;
    }

    public void editNasabah(int index, String namaAwal, String namaAkhir) {
        Nasabah data = nasabah.get(index);
        data.setNamaAwal(namaAwal);
        data.setNamaAkhir(namaAkhir);
        nasabah.set(index, data);
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        Nasabah data = new Nasabah(namaAwal, namaAkhir);
        data.setTabungan(new Tabungan(0));
        if (nasabah == null) {
            nasabah = new ArrayList();
        }
        nasabah.add(data);
        jumlahNasabah++;
    }

    public void editNasabah(int index, String namaAwal, String namaAkhir, User user) {
        Nasabah data = nasabah.get(index);
        data.setUser(user);
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

    public List<Nasabah> getNasabah() {
        return nasabah;
    }
}
