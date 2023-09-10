/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_2;

/**
 *
 * @author MSI
 */
public class Truk {

    public double muatan;
    public double muatanMaks;

    public Truk(double muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanMaks() {
        return muatanMaks;
    }

    public void tambahMuatan(double berat) {
        double muatanAkhir = muatan + berat;
        if (muatanAkhir <= muatanMaks) {
            muatan = muatanAkhir;
        }
    }
}
