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

// Class Example

public class ClassExample {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int inputNumber; // initialize inputted number by user
        
        // processing phase
        System.out.print("Enter integer: "); // prompt for input
        inputNumber = input.nextInt(); // obtain user input
        
        // method calling
        repeatNum(inputNumber);
    }
    
    // method that displays numbers from 1 to inputted number
    public static void repeatNum(int number) {
        int i; // initialize loop index
        
        // loop until inputted number is reached
        for (i = 1; i <= number; i++) {
            System.out.println(i); // display numbers
        }
    }
}
