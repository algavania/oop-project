/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_3;

/**
 *
 * @author MSI
 */
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan berapa deret fibonnaci? ");
        int number = scanner.nextInt();
        printFibonnaci(number);
    }

    public static void printFibonnaci(int number) {
        System.out.print(number + " deret Fibonnaci = ");
        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            if (i < 2) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.print(arr[i]+" ");
        }
    }
}
