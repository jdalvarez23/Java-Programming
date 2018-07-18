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

// Exercise 6.14

public class Ch6Exercise14 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int base; // initialize base number inserted by user
        int exponent; // initialize exponent number inserted by user
        int result; // initialize result number calculated by exponentiting the base by the exponent
        
        // processing phase
        System.out.print("Enter base number: "); // prompt for input
        base = input.nextInt(); // obtain user input
        System.out.print("Enter exponent number: "); // prompt for input
        exponent = input.nextInt(); // obtain user input
        
        // termination phase
        // execute if the exponent is greater than zero
        if (exponent > 0) {
         result = integerPower(base, exponent); // method called to calculate result from exponentiating base by exponent  
         
        // display information
        System.out.printf("%nCalculating result...%n");
        System.out.printf("-------------------------------------%n");
        System.out.printf("Result: %d%n", result);
        // execute if the exponent is not greater than zero
        } else {
            System.out.println("Exponent has to be a positive, nonzero integer!");
        }
    }
    
    // method that returns the value of base ^ exponent
    public static int integerPower(int baseNum, int exponentNum) {
        int calculationResult = 1; // initiate calculation result variable
        int i; // initialize loop index
        
        // loop while index is less than the exponent
        for (i = 0; i < exponentNum; i++) {
            calculationResult = calculationResult * baseNum; // calculation to multiply base number by itself exponent number of times
        }
        
        return calculationResult; // return value to main method
    }
}
