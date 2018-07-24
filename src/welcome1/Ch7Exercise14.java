/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome1;

import java.util.Scanner;

/**
 *
 * @author jalvarez343
 */

// Exercise 7.14

public class Ch7Exercise14 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int num1 = 3; // initialize variable
        int num2 = 5; // initialize variable
        int num3 = 7; // initialize variable
        int num4 = 9; // initialize variable
        
        // processing phase
        // display informartion
        System.out.printf("%nnumber 1 = %d, number 2 = %d, number 3 = %d, number 4 = %d%n", num1, num2, num3, num4);
        System.out.printf("%nCalculating products...%n");
        System.out.printf("-------------------------------------%n");
        System.out.printf("Product of %d and %d is: %d%n", num1, num2, product(num1, num2));
        System.out.printf("Product of %d, %d, and %d is: %d%n", num1, num2, num3, product(num1, num2, num3));
        System.out.printf("Product of %d, %d, %d and %d is: %d%n", num1, num2, num3, num4, product(num1, num2, num3, num4));
    }
    
    // method that calculates the product of a series of integers
    public static int product(int... numbers) {
        int total = 1; // initialize integer total (not zero because it would return zero)
        
        // calculate product of integers using the enhanced method
        for (int number : numbers) {
            total = total * number; // multiply total by number passed in method calling
        }
        return total; // return value to main method
    }
}
