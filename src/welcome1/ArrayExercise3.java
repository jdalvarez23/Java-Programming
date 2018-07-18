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

// Array Exercise #3

public class ArrayExercise3 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        final int ARRAY_SIZE = 10; // initialize and declare constant array size
        double[] array = new double[ARRAY_SIZE]; // initialize and declare double type array variable with array object
        int numberCounter = 0; // initialize loop index counter
        double number; // initialize number inserted by user
        
        // processing phase
        // loop until array length amount of integers are inserted
        while (numberCounter < ARRAY_SIZE) {
            System.out.print("Enter number: "); // prompt for input
            number = input.nextDouble(); // obtain user input

            array[numberCounter] = number; // insert number into double type array
            
            numberCounter++; // increment counter
        }
        
        // termination phase
        // display information
        System.out.printf("%nTerminating process...%n");
        System.out.printf("-------------------------------------%n");
        System.out.printf("Index of smallest number: %d%n", indexOfSmallestElement(array));
        System.out.printf("Value of smallest umber: %f%n", array[indexOfSmallestElement(array)]);
    }
    
    // method that returns average of double type array
    public static int indexOfSmallestElement(double[] array) {
        // execute if array length is less than or equal to one
        if (array.length <= 1) {
            return 0; // return zero
        // execute if array length is greater than one
        } else {
            int smallestIndex = 0; // initialize index of smallest value in array variable
            double smallestValue = array[smallestIndex]; // initialize smallest value in array variable and set value to first array value
        
            // loop through double type array
            for (int i = 0; i < array.length; i++) {
                if (array[i] < smallestValue) { // if array value is smaller than smallestValue variable
                    smallestValue = array[i]; // set smallestValue to array value
                    smallestIndex = i; // set smallestIndex to array value index
                }
            }
        
            return smallestIndex; // returns average integer to main method
        }
    }
    
}
