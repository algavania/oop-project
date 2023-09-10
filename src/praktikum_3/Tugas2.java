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

public class Tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun (1900-2005): ");
        int year = scanner.nextInt();
        if (year < 1900) {
            System.out.println("Maaf, tahun input di bawah 1900");
        } else if (year > 2005) {
            System.out.println("Maaf, tahun input di atas 2005");
        } else {
            boolean isLeapYear = isLeapYear(year);
            if (isLeapYear) {
                System.out.println(year + " adalah tahun kabisat");
            } else {
                System.out.println(year + " bukan tahun kabisat");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}
