/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_3;

/**
 *
 * @author MSI
 */
import java.util.Scanner;

public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printEvenNumbers();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan bilangan faktorial: ");
//        int number = scanner.nextInt();
//        printFactorialNumber(number);
    }

    public static void printFactorialNumber(int number) {
        System.out.println("n\t\tn!");
        System.out.println("-------------------------");
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
            System.out.println(i + "\t\t" + result);
        }
        System.out.println("-------------------------");
    }

    public static void printEvenNumbers() {
        for (int i = 2; i <= 20; i+=2) {
            if (i%6 == 0) continue;
            System.out.print(i+" ");
        }
    }
}
