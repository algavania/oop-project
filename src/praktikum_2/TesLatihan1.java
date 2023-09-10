/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_2;

/**
 *
 * @author MSI
 */
public class TesLatihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarang : " + tabungan.saldo);
    }
}
