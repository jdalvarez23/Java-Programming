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

// Exercise 4.17

public class Ch4Exercise17 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int totalMiles = 0; // initialize total number of miles
        int totalGallons = 0; // initialize total number of gallons
        int tripCounter = 0; // initialize # of trips created so far
        
        // processing phase
        System.out.print("Enter 1 to create new trip or -1 to quit: "); // prompt for input
        int createTrip = input.nextInt(); // obtain user input
        
        // loop until sentinel value reads from user
        while ((createTrip != -1) && (createTrip == 1)) {
            System.out.print("Enter number of miles: "); // prompt for input
            int miles = input.nextInt(); // obtain user input
            
            System.out.print("Enter number of gallons: "); // prompt for input
            int gallons = input.nextInt(); // obtain user input
            
            totalMiles = totalMiles + miles; // add miles to total miles
            totalGallons = totalGallons + gallons; // add gallons to total gallons
            
            tripCounter++; // increment counter
            
            System.out.printf("%nExtracting data for trip #%d...%n", tripCounter);
            System.out.printf("-------------------------------------%n");
            System.out.printf("Information for trip #%d %n", tripCounter);
            System.out.printf("Number of Miles: %d%n", miles);
            System.out.printf("Number of Gallons: %d%n", gallons);
            System.out.printf("%d miles per %d gallons %n", miles, gallons);
            System.out.printf("-------------------------------------%n");
            System.out.printf("Combined miles/gallon for %d trip(s): %d miles / %d gallons %n%n", tripCounter, totalMiles, totalGallons);
            
            
            System.out.print("Enter 1 to create new trip or -1 to quit: "); // prompt for input
            createTrip = input.nextInt(); // obtain user input
        }
        
        // termination phase
        if (tripCounter != 0) { // if user entered at least one trip
            double mileAverage = (double) totalMiles / tripCounter; // use number with decimal place to calculate average miles
            double gallonAverage = (double) totalGallons / tripCounter; // use number with decimal place to calculate average gallons
            double totalAverage = mileAverage / gallonAverage; // use number with decimal place to calculate mile / gallon average
            
            // display information
            System.out.printf("%nTerminating process...%n");
            System.out.printf("-------------------------------------%n");
            System.out.printf("Total Trips: %d%n", tripCounter);
            System.out.printf("Average Miles per Trip: %.2f %n", mileAverage);
            System.out.printf("Average Gallons per Trip: %.2f %n", gallonAverage);
            System.out.printf("Average Miles per Gallon: %.2f %n", totalAverage);
        } else { // if no trips were outputted
            System.out.println("No trip information was entered.");
        }
        
    }
}
