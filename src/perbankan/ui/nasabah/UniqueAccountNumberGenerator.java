/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.ui.nasabah;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author MSI
 */
public class UniqueAccountNumberGenerator {

    private final static Set<String> generatedValues = new HashSet<>();
    private final static Random random = new Random();

    public static String generateUniqueValue(int length) {
        String generatedValue;
        do {
            generatedValue = generateRandomValue(length);
        } while (!isUnique(generatedValue));
        generatedValues.add(generatedValue);
        return generatedValue;
    }

    private static String generateRandomValue(int length) {
        // Generate a random alphanumeric string of the specified length
        StringBuilder sb = new StringBuilder();
        String characters = "0123456789";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static boolean isUnique(String value) {
        return !generatedValues.contains(value);
    }
}