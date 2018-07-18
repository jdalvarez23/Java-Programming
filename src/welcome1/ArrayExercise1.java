/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome1;

import java.util.Scanner;

/**
 *
 * @author wrl123u
 */

// Array Exercise #1

public class ArrayExercise1 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        final int ARRAY_SIZE = 10; // initialize and declare constant array size
        int[] array = new int[ARRAY_SIZE]; // initialize and declare array variable with array object
        int numberCounter = 0; // initialize loop index counter
        int number; // initialize number inserted by user
        
        // processing phase
        // loop until array length amount of integers are inserted
        while (numberCounter < ARRAY_SIZE) {
            System.out.print("Enter integer: "); // prompt for input
            number = input.nextInt(); // obtain user input
            
            array[numberCounter] = number; // insert number into array
            
            numberCounter++; // increment counter
        }
        
        // termination phase
        // display information
        System.out.printf("%nTerminating process...%n");
        System.out.printf("-------------------------------------%n");
        displayReverse(array); // method called to display numbers inserted in reverse order
    }
    
    // method that displays numbers from last to first inserted
    public static void displayReverse(int[] array2) {
        int i; // initialize loop index
        
        // loop until all numbers in array have been read
        for (i = array2.length - 1; i >= 0; i--) {
            System.out.println(array2[i]); // display integer
        }

    }

}
