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

// Exercise 4.22

public class Ch4Exercise22 {
    // main method begins execution of Java application
    public static void main(String[] args) {        
        // initialization phase
        int number = 0; // initialize number counter
        int limit = 5; // initialize counter limit
        
        // processing phase
        System.out.format("%-10s%-10s%-10s%-10s%n%n", "N", "10*N", "100*N", "1000*N"); // display table head
        
        // loop until counter limit has been reached
        while (number < limit) {
            number++; // increment counter
            System.out.format("%-10s%-10s%-10s%-10s%n", number, number * 10, number * 100, number * 1000); // display table body
        }
    }
}
