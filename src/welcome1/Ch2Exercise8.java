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
public class Ch2Exercise8 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: "); // prompt
        int a; // declare integer variable a
        int b = 5; // declare integer variable b
        int c = 7; // declare integer variable c
        
        a = b * c; // assign product of variable b and c to integer variable a
        
        // This program performs a sample payroll calculation
        
        System.out.printf("Product is %d%n", a); // display the product
        
    } // end method main
    
} // end class Ch2Exercise8
