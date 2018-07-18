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

// Class Example - Arrays

public class InitArray {
    // main method begins execution of Java application
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10; // initialize and declare constant
        
        double[] fractions = new double[ARRAY_SIZE]; // initialize and create array
        
        //fractions[4]; // refer to array element 4
        
        fractions[9] = 1.667;
        
        fractions[6] = 3.333;
        
        double total = 0.0;
        
        for (int x = 0; x < fractions.length; x++) {
            total += fractions[x];
        }
    }
}
