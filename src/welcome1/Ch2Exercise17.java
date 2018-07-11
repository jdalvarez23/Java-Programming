/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome1;

import java.util.Scanner; // program uses class Scanner

/**
 *
 * @author wrl123u
 */
public class Ch2Exercise17 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer:"); // prompt first integer
        int number1 = input.nextInt(); // read first number from user
        
        System.out.print("Enter second integer:"); // prompt second integer
        int number2 = input.nextInt(); // read second number from user
        
        System.out.print("Enter third integer:"); // prompt second integer
        int number3 = input.nextInt(); // read second number from user
        
        int sum = number1 + number2 + number3; // add number1 and number2 and store sum
        int average = sum / 3; // add number1, number2, and number3, divide by 3 and store average
        int product = number1 * number2 * number3; // multiply number1 and number2 and store product
        int largest = 0;
        int smallest = 0;
        
        if (number1 > number2) {
            largest = number1;
            smallest = number2;
        }
        
        if (number2 > number1) {
            largest = number2;
            smallest = number1;
        }
        
        if (largest < number3) {
            largest = number3;
        }
        
        if (largest > number3) {
            largest = largest;
        }
        
        if (smallest < number3) {
            smallest = smallest;
        }
        
        if (smallest > number3) {
            smallest = number3;
        }
        
        System.out.printf("Sum: %d%n", sum); // display the sum
        System.out.printf("Average: %d%n", average); // display the average
        System.out.printf("Product: %d%n", product); // display the product
        System.out.printf("Smallest: %d%n", smallest); // display the smallest
        System.out.printf("Largest: %d%n", largest); // display the largest
    } // end method main
    
} // end class Ch2Exercise17
