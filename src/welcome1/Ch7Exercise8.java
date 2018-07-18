/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome1;

/**
 *
 * @author jalvarez343
 */

// Exercise 6.17

public class Ch7Exercise8 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // a) 
        int[] f = new int[10];
        System.out.println(f[6]);
        
        // b)
        int[] g = new int[5];
        for (int i = 0; i < 5; i++) {
            g[i] = 8;
        }
        
        // c) 
        int[] c = new int[100];
        double total = 0.00;
        for (int i = 0; i < 100; i++) {
            total += c[i];
        }
        
        // d)
        int[] a = new int[11];
        int[] b = new int[34];
        for (int i = 0; i < 11; i++) {
            b[i] = a[i];
        }
        
        // e)
        int[] w = new int[99];
        double smallest = w[0];
        for (int i = 0; i < w.length; i++) {
            if (w[i] < smallest) {
                smallest = w[i];
            }
        }
        
        // 7.11 TRANSFER TO NEW JAVA FILE
        // a)
        int[] counts = new int[10];
        for (int i = 0; i < 10; i++) {
            counts[i] = 0;
        }
        
        // b)
        int[] bonus = new int[15];
        for (int i = 0; i < 15; i++) {
            bonus[i] = bonus[i] + 1;
        }
        
        // c)
        int[] bestScores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(bestScores[i]);
        }
        
        
    }
}
