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

// Exercise 6.10

public class Ch6Exercise10 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        double numInserted; // initialize number inserted by user to be rounded
        int roundedInt; // initialize number rounded to nearest integer
        double roundedTenth; // initialize number rounded to nearest tenths place
        double roundedHundredth; // initialize number rounded to nearest hundredths place
        double roundedThousandth; // initialize number rounded to nearest thousandths place
        
        // processing phase
        System.out.print("Enter number: "); // prompt for input
        numInserted = input.nextDouble(); // obtain user input
        
        // termination phase
        roundedInt = roundToInteger(numInserted); // method called to round inserted number to nearest integer
        roundedTenth = roundToTenths(numInserted); // method called to round inserted number to nearest tenths place
        roundedHundredth = roundToHundredths(numInserted); // method called to round inserted number to nearest hundredths place
        roundedThousandth = roundToThousandths(numInserted); // method called to round inserted number to nearest thousandths place
        
        // display information
        System.out.printf("%nRounding numbers...%n");
        System.out.printf("-------------------------------------%n");
        System.out.printf("Original Value: %f%n", numInserted);
        System.out.printf("Rounded to nearest integer (whole number): %d%n", roundedInt);
        System.out.printf("Rounded to nearest tenths: %.1f%n", roundedTenth);
        System.out.printf("Rounded to nearest hundredths: %.2f%n", roundedHundredth);
        System.out.printf("Rounded to nearest thousandths: %.3f%n", roundedThousandth);
    }
    
    // method that rounds number inserted to nearest integer and returns value
    public static int roundToInteger(double x) {
        int integer = (int) Math.floor(x * 1 + 0.5) / 1; // calculation to round number to nearest integer
        return integer; // return value to main method
    }
    
    // method that rounds number inserted to nearest tenths place and returns value
    public static double roundToTenths(double x) {
        double y = Math.floor(x * 10 + 0.5) / 10; // calculation to round number to nearest tenths place
        return y; // return value to main method
    }
    
    // method that rounds number inserted to nearest hundredths place and returns value
    public static double roundToHundredths(double x) {
        double y = Math.floor(x * 100 + 0.5) / 100; // calculation to round number to nearest hundredths place
        return y; // return value to main method
    }
    
    // method that rounds number inserted to nearest thousandths place and returns value
    public static double roundToThousandths(double x) {
        double y = Math.floor(x * 1000 + 0.5) / 1000; // calculation to round number to nearest thousandths place
        return y; // return value to main method
    }
}
