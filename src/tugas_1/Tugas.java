package tugas_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, number2;
        try {
            System.out.print("Masukkan jumlah data Fibonacci: ");
            number = scanner.nextInt();
            Fibonacci fibonacci = new Fibonacci();
            PrimeNumber primeNumber = new PrimeNumber();
            System.out.println("Fibonacci: ");
            fibonacci.print(number);
            System.out.print("\nMasukkan jumlah data Prima: ");
            number2 = scanner.nextInt();
            System.out.println("\nPrime Number: ");
            primeNumber.print(number2);
        } catch (InputMismatchException e) {
            System.out.println("Salah input.");
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
