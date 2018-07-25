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

// Array Exercises 2 #3

public class ArrayExercise6 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        final int ARRAY_SIZE = 10; // initialize and declare constant array size
        int[] array = new int[ARRAY_SIZE]; // initialize and declare integer type array variable with array object
        int numberCounter = 0; // initialize loop index counter
        int number; // initialize number inserted by user
        
        // processing phase
        // loop until array length amount of integers are inserted
        while (numberCounter < ARRAY_SIZE) {
            System.out.print("Enter number: "); // prompt for input
            number = input.nextInt(); // obtain user input

            array[numberCounter] = number; // insert number into integer type array
            
            numberCounter++; // increment counter
        }
        
        int[] distinctNumArray = eliminateDuplicates(array); // calling method that returns array with no duplicates
        
        // termination phase
        // display information
        System.out.printf("%nTerminating process...%n");
        System.out.printf("-------------------------------------%n");
        System.out.println("Distinct list of numbers is: ");
        // loop through double type array
        for (int i = 0; i < distinctNumArray.length; i++) {
            System.out.print(" " + distinctNumArray[i]); // print line with number
        }
        System.out.println(); // print empty line
    }
    
    // method that returns reversed array
    public static int[] eliminateDuplicates(int[] list) {
        // execute if array length is less than or equal to one
        if (list.length <= 1) {
            return null; // return null
        // execute if array length is greater than one
        } else {
            int[] newList = new int[list.length]; // initialize and declare integer type array variable with array object       
            int newListIndex = 0; // initialize index of new list array variable
            
            
            // loop through integer type array
            for (int i = 0; i < list.length; i++) {
                
                boolean isDuplicate = false;
                // loop through new list array
                for (int k = 0; k < list.length; k++) {
                    // execute if value in new list array is not the same as original array
                    if (newList[k] == list[i]) {
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate) {
                    newList[newListIndex++] = list[i]; // set new list array value as original array value
                }
            }
            int[] returnArray = new int[newListIndex]; // initialize and declare integer type array variable with array object  
            
            // loop through integer type array
            for (int i = 0; i < newListIndex; i++) {
                returnArray[i] = newList[i]; // set return array value as value from new list array
            }
        
            return returnArray; // returns new, duplicate-free, array to main method
        }
    }
    
}
