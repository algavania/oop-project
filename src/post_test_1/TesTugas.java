/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package post_test_1;

/**
 *
 * @author MSI
 */
import java.util.Scanner;

public class TesTugas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyak bangun: ");
        int n = scanner.nextInt();
        BangunDatar arr[] = new BangunDatar[n];
        BangunDatar segitiga[] = new BangunDatar[n];
        BangunDatar lingkaran[] = new BangunDatar[n];
        BangunDatar jajarGenjang[] = new BangunDatar[n];

        BangunDatar kubus[] = new BangunDatar[n];
        BangunDatar balok[] = new BangunDatar[n];

        generateArray(arr, n, 1);
        generateArray(segitiga, n, 2);
        generateArray(lingkaran, n, 3);
        generateArray(jajarGenjang, n, 4);
        generateArray(kubus, n, 5);
        generateArray(balok, n, 6);

        System.out.println("Persegi");
        printArray(arr);
        
        System.out.println("Segitiga");
        System.out.println("");
        printArray(segitiga);
        
        System.out.println("Lingkaran");
        System.out.println("");
        printArray(lingkaran);
        System.out.println("");
        
        System.out.println("Jajar Genjang");
        printArray(jajarGenjang);
        System.out.println("");
        
        System.out.println("Kubus");
        printArray(kubus);
        System.out.println("");
        
        System.out.println("Balok");
        printArray(balok);
        System.out.println("");

    }

    public static void generateArray(BangunDatar arr[], int n, int type) {
        for (int i = 0; i < arr.length; i++) {
            int panjang = i + 1;
            switch (type) {
                case 1 -> arr[i] = new Persegi(panjang);
                case 2 -> arr[i] = new Segitiga(panjang);
                case 3 -> arr[i] = new Lingkaran(panjang);
                case 4 -> arr[i] = new JajarGenjang(panjang);
                case 5 -> arr[i] = new Kubus(panjang);
                case 6 -> arr[i] = new Balok(panjang);

            }
        }
    }

    public static void printArray(BangunDatar arr[]) {
        System.out.println("Index\tLuas\t\tKeliling\t\tVolume");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "\t" + arr[i].hitungLuas() + "\t\t" + arr[i].hitungKeliling()+"\t\t"+arr[i].hitungVolume());
        }
    }
}
