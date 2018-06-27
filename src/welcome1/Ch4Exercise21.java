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

// Exercise 4.21

public class Ch4Exercise21 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int numberCounter = 0; // initialize number inserted counter
        int number; // initialize number inserted by user
        int largest = 0; // initialize largest number inserted by user
        int limit = 10;
        
        // processing phase
        System.out.print("Enter first integer: "); // prompt for input
        number = input.nextInt(); // obtain user input
        
        // loop until ten integers have been inserted
        while (numberCounter <= limit) {
            numberCounter++; // increment counter
                       
            if (number > largest) { // if the number inserted is larger
                largest = number; // set largest variable to new number
            }
      
            if (numberCounter < limit) { // if number counter is less than the limit
                System.out.print("Enter another integer: "); // prompt for input
                number = input.nextInt(); // obtain user input
            }
        }
        
        // terminating phase
        if (numberCounter != 0) { // if user quits
            // display information
            System.out.printf("%nTerminating process...%n");
            System.out.printf("-------------------------------------%n");
            System.out.printf("Largest integer inserted: %d%n", largest);
        } else { // if no integers were inserted
            System.out.println("No integer was entered.");
        }
    }
}
