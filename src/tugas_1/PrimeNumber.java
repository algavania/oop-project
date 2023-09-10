package tugas_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class PrimeNumber {

    public PrimeNumber() {
    }

    public void print(int number) {
        int i = 0, j = 2;
        while (i < number) {
            if (isPrime(j)) {
                System.out.print(j + " ");
                i++;
            }
            j++;
        }
    }

    public boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
