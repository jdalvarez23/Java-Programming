/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceTest;

import java.util.Scanner; // program uses class Scanner

/**
 *
 * @author jalvarez343
 */
public class InvoiceTest {
    // main method begins execution of Java application
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1", "A land vehicle that facilitates travel in Mars.", 3, 1000000.00);
        
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name of customer: "); // prompt
        String customer = input.nextLine(); // obtain user input
        
        // display invoice information
        System.out.printf("%nCreating invoice for %s...%n", customer);
        System.out.printf("-------------------------------------%n");
        System.out.printf("Part Number: %s%n", invoice1.getNumber());
        System.out.printf("Part Description: %s%n", invoice1.getDescription());
        System.out.printf("Quantity: %d%n", invoice1.getQuantity());
        System.out.printf("Part Price: $%.2f%n", invoice1.getPrice());
        System.out.printf("Total Cost: $%.2f%n", invoice1.getInvoiceAmount());
        System.out.printf("-------------------------------------%n");
        
        //display edit mode
        System.out.printf("Edit invoice mode activating...%n%n");
        
        System.out.print("Enter new part number: "); // prompt
        String partNumber = input.nextLine(); // obtain user input
        invoice1.setNumber(partNumber); // set new part number
        
        System.out.print("Enter new part description: "); // prompt
        String partDescription = input.nextLine(); // obtain user input
        invoice1.setDescription(partDescription); // set new part description
        
        System.out.print("Enter new quantity: "); // prompt
        int partQuantity = input.nextInt(); // obtain user input
        invoice1.setQuantity(partQuantity); // set new quantity
        
        System.out.print("Enter new price: "); // prompt
        double partPrice = input.nextDouble(); // obtain user input
        invoice1.setPrice(partPrice); // set new part price
        
        // display invoice information
        System.out.printf("%nCreating new invoice for %s...%n", customer);
        System.out.printf("-------------------------------------%n");
        System.out.printf("Part Number: %s%n", invoice1.getNumber());
        System.out.printf("Part Description: %s%n", invoice1.getDescription());
        System.out.printf("Quantity: %d%n", invoice1.getQuantity());
        System.out.printf("Part Price: $%.2f%n", invoice1.getPrice());
        System.out.printf("Total Cost: $%.2f%n", invoice1.getInvoiceAmount());
        System.out.printf("-------------------------------------%n");
    }
}
