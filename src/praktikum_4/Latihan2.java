/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_4;

/**
 *
 * @author MSI
 */
import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Masukkan jumlah deretan Fibonacci: ");
        number = scanner.nextInt();
        printFibonacci(number);
    }

    public static void printFibonacci(int number) {
        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i < 2) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.print(arr[i] + " ");
        }
    }
}
