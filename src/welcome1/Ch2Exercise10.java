/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome1;

//import java.util.Scanner; // program uses class Scanner

/**
 *
 * @author wrl123u
 */
public class Ch2Exercise10 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        //Scanner input = new Scanner(System.in);
        int x = 2; // declare integer variable x
        int y = 3; // declare integer variable y
        
        System.out.printf("a) x = %d%n", x); // displays statement exercise 10 a
        System.out.printf("b) Value of %d + %d is %d%n", x, x, (x + x)); // displays statement exercise 10 b
        System.out.printf("c) x ="); // displays statement exercise 10 c
        System.out.printf("%n"); // displays line break (not required in problem but added for clean display
        System.out.printf("d) %d = %d%n", (x + y), (y + x)); // displays statement exercise 10 d
    } // end method main
    
} // end class Ch2Exercise10
