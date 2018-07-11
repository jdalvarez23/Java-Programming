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
public class Ch2Exercise13 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // NOTE: Operator (*, /, %) are evaluated first, if several operators of this type they are evaluated from left to right
        // NOTE: Operator (+, -) are evaluated next, if several operators of this type they are are evaluated from left to right
        // NOTE: Operator (=) are evaluated last
    
        int x = 7 + 3 * 6 / 2 - 1; // declare integer variable x
        System.out.printf("Order of Evaluation 13) a:%n1st (3 * 6), %n2nd (18 / 2), %n3rd (7 + 9), %n4th (16 - 1) %nAnswer: %d%n", x); // display order of evaluation and answer
        Ch2Exercise13b(); // run next function
    } // end method main
    
    // problem b method begins execution of Java application
    public static void Ch2Exercise13b() {
       int x = 2 % 2 + 2 * 2 - 2 / 2; // declare integer variable x
       System.out.printf("%nOrder of Evaluation 13) b:%n1st (2 mod 2), %n2nd (2 * 2), %n3rd (2 / 2), %n4th (0 + 4 - 1) %nAnswer: %d%n", x);
       Ch2Exercise13c(); // run next function
    } // end method Ch2Exercise13b 
    
    // problem c method begins execution of Java application
    public static void Ch2Exercise13c() {
       int x = (3 * 9 * (3 + (9 * 3 / (3)))); // declare integer variable x
       System.out.printf("%nOrder of Evaluation 13) c:%n1st (3 * 9), %n2nd [27 * (3 + (27) / 3)], %n3rd [27 * (3 + 9)], %n4th (27 * 12) %nAnswer: %d%n", x);
    } // end method Ch2Exercise13c
    
} // end class Ch2Exercise13
