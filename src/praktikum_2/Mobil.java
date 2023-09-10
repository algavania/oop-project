/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_2;

/**
 *
 * @author MSI
 */
public class Mobil {

    public String merk;
    public String warna;
    public String tipe;
    public int hargaSewa;
    public int jumlahSeat;

    public Mobil(String merk, String warna, String tipe, int hargaSewa, int jumlahSeat) {
        this.merk = merk;
        this.warna = warna;
        this.tipe = tipe;
        this.hargaSewa = hargaSewa;
        this.jumlahSeat = jumlahSeat;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + "\nWarna: " + warna + "\nTipe: " + tipe + "\nHarga Sewa: " + hargaSewa + "\nJumlah Seat: " + jumlahSeat);
    }

}
