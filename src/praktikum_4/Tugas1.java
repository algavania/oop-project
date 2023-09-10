/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_4;

/**
 *
 * @author MSI
 */
public class Tugas1 {

    public static void main(String[] args) {
        int[][] arrayOfInts = {{32, 87, 3, 589}, {12, 1076, 2000, 8},
        {622, 127, 77, 955}};
        int desiredNumber = 12;
        String res = findNumber(arrayOfInts, desiredNumber);
        System.out.println(res.isEmpty() ? desiredNumber + " tidak ditemukan" : "Found "+desiredNumber+" at "+res);
    }

    public static String findNumber(int arrayOfInts[][], int desiredNumber) {
        String res = "";
        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == desiredNumber) {
                    res = ""+i+", "+j;
                    return res;
                }
            }
        }
        return res;
    }
}
