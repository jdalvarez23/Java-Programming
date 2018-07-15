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

// Exercise 6.16

public class Ch6Exercise16 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int number1; // initialize first integer inserted by user
        int number2; // initialize second integer inserted by user
        int pairCounter = 0; // initialize pair counter
        boolean result; // initialize result boolean returned from isMultiple method
        
        // processing phase
        System.out.print("Enter 1 to insert new pair of numbers or -1 to quit: "); // prompt for input
        int insertDataSentinel = input.nextInt(); // obtain user input
        
        // loop until sentinel value reads from user
        while ((insertDataSentinel != -1) && (insertDataSentinel == 1)) {
            System.out.print("Enter first integer: "); // prompt for input
            number1 = input.nextInt(); // obtain user input
            System.out.print("Enter second integer: "); // prompt for input
            number2 = input.nextInt(); // obtain user input

            result = isMultiple(number1, number2); // method called to determine if number2 is multiple of number1 

            pairCounter++; // increment employee counter
            
            // display information
            System.out.printf("%nCalculating result...%n");
            System.out.printf("-------------------------------------%n");
            // execute if number 2 is multiple of number 1
            if (result == true) {
                System.out.println(result);
                System.out.printf("Result: %d is a multiple of %d%n%n", number2, number1);
            // execute if number 2 is not multiple of number 1
            } else {
                System.out.println(result);
                System.out.printf("Result: %d is not a multiple of %d%n%n", number2, number1);
            }
            
            System.out.print("Enter 1 to insert new pair of numbers or -1 to quit: "); // prompt for input
            insertDataSentinel = input.nextInt(); // obtain user input
        }
        
        // termination phase
        if (pairCounter != 0) { // if user quits
            // display information
            System.out.printf("%nTerminating process...%n");
            System.out.printf("-------------------------------------%n");
            System.out.printf("Process terminated.%n");
        } else { // if no items were inserted
            System.out.println("No data entered.");
        }
    }
    
    // method that returns boolean value on second number being multiple of first number
    public static boolean isMultiple(int number1, int number2) {
        boolean isMultiple; // initialize boolean result variable
        
        int remainder = number2 % number1; // declares integer variable remainder as number2 modular number1 (Remainder operator: %)
        // NOTE: The expression x%y yields the remainder after x is divided by y
        
        if (remainder == 0) {
            isMultiple = true; // if remainder = 0 then number2 is a multiple of number1
        } else {
            isMultiple = false; // if remainder != 0 then number2 is not a multiple of number1
        }
        
        return isMultiple; // return value to main method
    }
}
