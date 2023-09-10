package post_test_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class Balok extends Kubus {

    public Balok(double sisi) {
        super(sisi);
    }

    @Override
    public double hitungLuas() {
        return 2 * super.hitungLuas();
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

}
