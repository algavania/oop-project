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

public class Latihan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Masukkan bilangan: ");
        number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " adalah bilangan prima");
        } else {
            System.out.println(number + " bukan termasuk bilangan prima");
        }
    }

    public static boolean isPrime(int n) {
        int factor = 0;
        for (int i = 1; i <= n && factor <= 2; i++) {
            if (n % i == 0) {
                factor++;
            }
        }
        return factor == 2;
    }
}
