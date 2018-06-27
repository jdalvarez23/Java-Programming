/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountTest;

import java.util.Scanner; // progam uses class Scanner

/**
 *
 * @author jalvarez343
 */

// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.

public class AccountTest {
    // main method begins execution of Java application
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);
        
        // display initial balance of each project
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
        
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account1: "); // prompt 
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance...%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1's balance
        
        // display balances
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
        
        System.out.print("Enter deposit amount for account2: "); // prompt 
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance...%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2's balance
        
        // display balances
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
        
        System.out.print("Enter a withdraw amount for account1: "); // prompt 
        double withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nwithdrawing %.2f from account1 balance...%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount); // add to account1's balance   
        
        // display balances
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
        
        System.out.print("Enter withdraw amount for account2: "); // prompt 
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nwithdrawing %.2f from account2 balance...%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount); // add to account2's balance
        
        // display balances
        System.out.printf("%s new balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s new balance: %.2f%n", account2.getName(), account2.getBalance());
        
    }
}
