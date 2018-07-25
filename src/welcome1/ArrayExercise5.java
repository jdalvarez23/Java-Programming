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

// Array Exercises 2 #2

public class ArrayExercise5 {
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
        
        double[] reverseArray = reverse(array); // calling method that returns array reversed
        
        // termination phase
        // display information
        System.out.printf("%nTerminating process...%n");
        System.out.printf("-------------------------------------%n");
        
        // loop through double type array
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.printf("%n%f", reverseArray[i]); // print line with number
        }
        System.out.println(); // print empty line
    }
    
    // method that returns reversed array
    public static double[] reverse(double[] array) {
        // execute if array length is less than or equal to one
        if (array.length <= 1) {
            return null; // return null
        // execute if array length is greater than one
        } else {
            int lastIndex = array.length - 1; // initialize last index variable and set value to last array value        
        
            double[] reverse = new double[array.length]; // initialize and declare double type array variable with array object
            
            // loop through double type array
            for (int i = 0; i < reverse.length; i++) {
                reverse[i] = array[lastIndex--]; // set reverse array values from desc order in array
            }
        
            return reverse; // returns new reversed array to main method
        }
    }
    
}
