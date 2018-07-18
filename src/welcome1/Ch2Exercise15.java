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
public class Ch2Exercise15 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer:"); // prompt first integer
        int number1 = input.nextInt(); // read first number from user
        
        System.out.print("Enter second integer:"); // prompt second integer
        int number2 = input.nextInt(); // read second number from user
        
        int sum = number1 + number2; // add number1 and number2 and store sum
        int product = number1 * number2; // multiply number1 and number2 and store product
        int difference = number1 - number2; // subtract number1 and number2 and store difference
        int quotient = number1 / number2; // divide number1 by number2 and store quotient
        
        System.out.printf("Sum: %d%n", sum); // display the sum
        System.out.printf("Product: %d%n", product); // display the product
        System.out.printf("Difference: %d%n", difference); // display the difference
        System.out.printf("Quotient (Division): %d%n", quotient); // display the quotient
    } // end method main
    
} // end class Ch2Exercise15
