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

// Array Exercise #2

public class ArrayExercise2 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        final int ARRAY_SIZE = 10; // initialize and declare constant array size
        int[] intArray = new int[ARRAY_SIZE]; // initialize and declare integer type array variable with array object
        double[] doubleArray = new double[ARRAY_SIZE]; // initialize and declare double type array variable with array object
        int numberCounter = 0; // initialize loop index counter
        double number; // initialize number inserted by user
        
        // processing phase
        // loop until array length amount of integers are inserted
        while (numberCounter < ARRAY_SIZE) {
            System.out.print("Enter number: "); // prompt for input
            number = input.nextDouble(); // obtain user input
            
            intArray[numberCounter] = (int) number; // insert number into integer type array
            doubleArray[numberCounter] = number; // insert number into double type array
            
            numberCounter++; // increment counter
        }
        
        // termination phase
        // display information
        System.out.printf("%nTerminating process...%n");
        System.out.printf("-------------------------------------%n");
        System.out.printf("Integer type average of array elements: %d%n", average(intArray));
        System.out.printf("Double type average of array elements: %f%n", average(doubleArray));
    }
    
    // method that returns average of integer type array
    public static int average(int[] array) {
        int total = 0; // initialize total variable
        int average = 0; // initialize average variable
        
        // loop through integer type array
        for (int number : array) {
            total += number; // add each element's value to total
        }
        
        average = total / array.length; // calculates array average
        
        return average; // returns average integer to main method
    }
    
    // method that returns average of double type array
    public static double average(double[] array) {
        double total = 0; // initialize total variable
        double average = 0; // initialize average variable
        
        // loop through double type array
        for (double number : array) {
            total += number; // add each element's value to total
        }
        
        average = total / array.length; // calculates array average
        
        return average; // returns average integer to main method
    }
    
}
