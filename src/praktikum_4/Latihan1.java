package praktikum_4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class Latihan1 {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Ahmad", 1, 81, 90, 62);
        Mahasiswa m2 = new Mahasiswa("Adang", 2, 50, 83, 87);
        Mahasiswa m3 = new Mahasiswa("Dani", 3, 89, 55, 65);
        Mahasiswa m4 = new Mahasiswa("Edi", 4, 77, 70, 92);
        Mahasiswa arr[] = new Mahasiswa[4];
        arr[0] = m1;
        arr[1] = m2;
        arr[2] = m3;
        arr[3] = m4;
        printArray(arr);
    }

    public static void printArray(Mahasiswa arr[]) {

        System.out.println("NRP\tRata-rata");
        System.out.println("------------------------------------");
        for (Mahasiswa arr1 : arr) {
            System.out.println(arr1.getNrp() + "\t" + arr1.calculateAverage());
        }
        System.out.println("------------------------------------");
    }
}
