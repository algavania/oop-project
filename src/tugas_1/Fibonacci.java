/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_1;

import java.math.BigInteger;

/**
 *
 * @author MSI
 */
public class Fibonacci {

    public Fibonacci() {
    }

    public void print(int number) {
        BigInteger arr[] = new BigInteger[number];
        for (int i = 0; i < number; i++) {
            if (i < 2) {
                arr[i] = BigInteger.valueOf(1);
            } else {
                arr[i] = arr[i - 1].add(arr[i - 2]);
            }
            System.out.print(arr[i] + " ");
        }
    }

    public boolean isFibonacci(int number) {
        return isPerfectSquare(number);
    }

    private boolean isPerfectSquare(int n) {
        int s = (int) Math.sqrt(n);
        return s * s == n;
    }
}
