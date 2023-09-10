/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package post_test_1;

/**
 *
 * @author MSI
 */
public class Lingkaran extends BangunDatar {
    public double sisi;

    public Lingkaran(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        return 3.14*sisi*sisi;
    }

    @Override
    public double hitungKeliling() {
        return 2*3.14*sisi;
    }

    @Override
    public double hitungVolume() {
        return 0;
    }
}
