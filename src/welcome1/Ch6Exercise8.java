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

// Exercise 6.8

public class Ch6Exercise8 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        double hoursParked; // initialize number of hours parked by customer
        
        // processing phase
        System.out.print("Enter # of hours parked: "); // prompt for input
        hoursParked = input.nextDouble(); // obtain user input
        
        // terminating phase
        if (hoursParked <= 24) {
            calculateCharges(hoursParked); // method called to display charges for current customer
        } else {
            System.out.println("Customers cannot park longer than 24 hours at a time!");
        }
    }
    
    // method that calculates and displays charges for current customer
    public static void calculateCharges(double hours) {
        double minimumCharge = 2.00; // initialize minimum fee to park for up to three hours
        double additionalCharge = 0.50; // initialize addition fee per hour after three hours
        double maximumCharge = 10.00; // initialize maximum charge fee for 24 hour period
        double totalCharged = 0; // initialize total amount charged to customer
        double additionalHours = 0; // initialize amount of hours past three hours
        
        // execute if customer parked for more than 3 hours
        if ((hours > 3) && (hours != 24)) {
            additionalHours = hours - 3; // Retrieve number of additional hours
            totalCharged = minimumCharge + (additionalHours * additionalCharge); // calculate total amount charged            
        // execute if customer parked for less than 3 hours
        } else if (hours < 3) {
            totalCharged = minimumCharge; // total amount charged is minimum fee
        // execute if customer parked for exactly 24 hours
        } else if (hours == 24) {
            additionalHours = hours - 3; // Retrieve number of additional hours
            additionalCharge = 0; // set additional charge to zero
            totalCharged = maximumCharge; // total amount charged is maximum fee
        }
        
        // display information
        System.out.printf("%nProcessing data for customer...%n");
        System.out.printf("-------------------------------------%n");
        System.out.printf("Total Hours: %.2f%n", hours);
        System.out.printf("Additional Hours (hours in excess of 3 hours): %.2f%n", additionalHours);
        System.out.printf("Additional Cost ($0.50 per hour in excess of 3 hours): $%.2f%n", (additionalHours * additionalCharge));
        System.out.printf("-------------------------------------%n");
        System.out.printf("Total Amount Due: $%.2f%n%n", totalCharged);
    }
}
