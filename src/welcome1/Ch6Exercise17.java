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

// Exercise 6.17

public class Ch6Exercise17 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int number; // initialize integer inserted by user
        int intCounter = 0; // initialize integer counter
        boolean result; // initialize result boolean returned from isEven method
        
        // processing phase
        System.out.print("Enter 1 to insert new integer or -1 to quit: "); // prompt for input
        int insertDataSentinel = input.nextInt(); // obtain user input
        
        // loop until sentinel value reads from user
        while ((insertDataSentinel != -1) && (insertDataSentinel == 1)) {
            System.out.print("Enter integer: "); // prompt for input
            number = input.nextInt(); // obtain user input

            result = isEven(number); // method called to determine if integer is even or odd

            intCounter++; // increment employee counter
            
            // display information
            System.out.printf("%nCalculating result...%n");
            System.out.printf("-------------------------------------%n");
            // execute if number inputted is even
            if (result == true) {
                System.out.println(result);
                System.out.printf("Result: %d is even.%n%n", number);
            // execute if number inputted is odd
            } else {
                System.out.println(result);
                System.out.printf("Result: %d is odd.%n%n", number);
            }
            
            System.out.print("Enter 1 to insert new integer or -1 to quit: "); // prompt for input
            insertDataSentinel = input.nextInt(); // obtain user input
        }
        
        // termination phase
        if (intCounter != 0) { // if user quits
            // display information
            System.out.printf("%nTerminating process...%n");
            System.out.printf("-------------------------------------%n");
            System.out.printf("Process terminated.%n");
        } else { // if no items were inserted
            System.out.println("No data entered.");
        }
    }
    
    // method that returns boolean value on integer being even or odd
    public static boolean isEven(int numberInserted) {
        boolean isEven; // initialize boolean result variable
        
        int remainder = numberInserted % 2; // declares integer variable remainder as number modular 2 (Remainder operator: %)
        
        if (remainder == 0) {
            isEven = true; // if remainder = 0 then number is even
        } else {
            isEven = false; // if remainder != 0 then number is odd
        }
        
        return isEven; // return value to main method
    }
}
