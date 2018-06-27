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
public class Ch2Exercise26 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: "); // prompt first integer
        int number1 = input.nextInt(); // read first number from user
        
        System.out.print("Enter second integer: "); // prompt second integer
        int number2 = input.nextInt(); // read second number from user
      
        int remainder = number1 % number2; // declares integer variable remainder as number1 modular number2 (Remainder operator: %)
        // NOTE: The expression x%y yields the remainder after x is divided by y
        // NOTE: If remainder = 0 then number1 is a multiple of number2
        System.out.printf("%d is a multiple of %d: %s%n", number1, number2, remainder == 0); // display statement
    } // end method main
    
} // end class Ch2Exercise26