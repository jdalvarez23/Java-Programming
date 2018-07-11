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

// Exercise 4.18

public class Ch4Exercise18 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int accountNumber; // initialize account number
        int beginnerBalance; // initialize initial balance
        int totalItemsCharged; // initialize total items charged to account
        int totalCreditsApplied; // initialize total credits applied to account
        int allowedCredit; // initialize allowed credit on account
        
        // processing phase
        System.out.printf("%nThis program determines whether any of several department-store customers has exceeded their credit limit.%n%n");
        
        System.out.print("Enter account number: "); // prompt for input
        accountNumber = input.nextInt(); // obtain user input
        
        System.out.print("Enter account balance at beginning of month: "); // prompt for input
        beginnerBalance = input.nextInt(); // obtain user input
        
        System.out.print("Enter total of all items charged by the customer this month: "); // prompt for input
        totalItemsCharged = input.nextInt(); // obtain user input
        
        System.out.print("Enter total of all credits applied to the customer's account this month: "); // prompt for input
        totalCreditsApplied = input.nextInt(); // obtain user input
        
        System.out.print("Enter allowed credit limit: "); // prompt for input
        allowedCredit = input.nextInt(); // obtain user input
        
        int newBalance = beginnerBalance + totalItemsCharged - totalCreditsApplied; // calculate new balance by adding beginning balance + charges - credits
        
        
        // display account information
        System.out.printf("%nProcessing data for account #%d...%n", accountNumber);
        System.out.printf("-------------------------------------%n");
        System.out.printf("Account Number: %d%n", accountNumber);
        System.out.printf("Balance at beginning of month: $%d%n", beginnerBalance);
        System.out.printf("Total of all items charged by the customer this month: $%d%n", totalItemsCharged);        
        System.out.printf("Total of all credits applied to this customer's account this month: $%d%n", totalCreditsApplied); 
        System.out.printf("Allowed credit limit on this account: $%d%n", allowedCredit); 
        System.out.printf("New account balance: $%d%n", newBalance); 
        
        if (newBalance > allowedCredit) { // if new balance exceeds credit limit
            System.out.printf("Message: CREDIT LIMIT EXCEEDED!%n"); 
        }
       
    }
}
