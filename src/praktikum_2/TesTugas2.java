/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_2;

/**
 *
 * @author MSI
 */
public class TesTugas2 {

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "pick up", 1500, 2);
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5);
        Mobil mobil4 = new Mobil("Honda", "Merah", "sedan", 1300, 5);
        System.out.println("Mobil 1");
        mobil1.tampilkanInfo();
        System.out.println("Mobil 2");
        mobil2.tampilkanInfo();
        System.out.println("Mobil 3");
        mobil3.tampilkanInfo();
        System.out.println("Mobil 4");
        mobil4.tampilkanInfo();
    }
}
