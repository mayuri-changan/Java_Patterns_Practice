
package com.demo.convert;
public class RepeatedCharacters{
public static void main(String[] args) {

        String s = "programming";
        int[] count = new int[256];   // ASCII array

        // Step 1: count frequency
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        // Step 2: find max frequency
        int max = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        // Step 3: print all characters with max frequency
        System.out.println("Max frequency: " + max);
        System.out.print("Character(s): ");

        for (int i = 0; i < 256; i++) {
            if (count[i] == max)
            {
                System.out.print((char) i + " ");
            }
        }
    }
}

