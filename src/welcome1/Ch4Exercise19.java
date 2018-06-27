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

// Exercise 4.19

public class Ch4Exercise19 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        double baseCommissionRate = 200.00; // instance variable
        double grossPercentage = 0.09; // instance variable
        double grossSales = 0.00; // instance variable
        int itemCounter = 0; // instance variable
        double totalSales; // instance variable
        double item; // instance variable (dependent on user input)
        
        // processing phase
        System.out.print("Enter 1 to insert items sold or -1 to quit: "); // prompt for input
        int insertSoldItems = input.nextInt(); // obtain user input
        
        // loop until sentinel value reads from user
        while ((insertSoldItems != -1) && (insertSoldItems == 1)) {
            System.out.print("Enter item number: "); // prompt for input
            int itemNumber = input.nextInt(); // obtain user input
            
            // validate user input
            switch (itemNumber) {
                case 1:
                    item = 239.99; // instance variable (item 1 price)
                    break;
                case 2:
                    item = 129.75; // instance variable (item 2 price)
                    break;
                case 3:
                    item = 99.95; // instance variable (item 3 price)
                    break;
                case 4:
                    item = 350.89; // instance variable (item 4 price)
                    break;
                default:
                    item = 0; // instance variable (invalid item)
                    System.out.println("No valid item was entered.");
                    break;
            }
            
            if (item != 0) { // if user valid item
                 System.out.print("Enter quantity of item: "); // prompt for input
                 int itemQuantity = input.nextInt(); // obtain user input
                 
                 if (itemQuantity > 0) { // if quantity is greater than 0
                     grossSales = grossSales + (itemQuantity * item); // multiply quantity of items by item price
                     itemCounter++; // increment counter
                     
                     System.out.printf("%n-------------------------------------%n");
                     System.out.printf("Item %d price: $%.2f%n", itemNumber, item);
                     System.out.printf("Item quantity: %d%n", itemQuantity);
                     System.out.printf("-------------------------------------%n");
                     System.out.printf("Saleperson's current sales: $%.2f%n%n", grossSales);
                     System.out.print("Enter 1 to insert new items sold or -1 to quit: "); // prompt for input
                     insertSoldItems = input.nextInt(); // obtain user input
                 } else {
                     System.out.println("Invalid quantity entered.");
                     
                     System.out.print("Enter 1 to insert new items sold or -1 to quit: "); // prompt for input
                     insertSoldItems = input.nextInt(); // obtain user input
                 }
            }
        }
        
        // termination phase
        if (itemCounter != 0) { // if user quits
            totalSales = baseCommissionRate + (grossSales * grossPercentage); // determine total salesperson's earnings
            
            // display information
            System.out.printf("%nTerminating process...%n");
            System.out.printf("-------------------------------------%n");
            System.out.printf("Total weekly salesperson's earnings: $%.2f%n", totalSales);
        } else { // if no items were inserted
            System.out.println("No item information was entered.");
        }
        
    }
}
