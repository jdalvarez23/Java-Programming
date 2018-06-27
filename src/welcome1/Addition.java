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
public class Addition {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user
        
        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user
        
        int sum = number1 + number2; // add numbers, then store total in sum
        
        // NOTE: %d is for integers, %s is for strings, %f is for doubles, and %n is a line break
        System.out.printf("Sum is %d%n", sum); // display sum
    } // end method main
} // end class Welcome1
