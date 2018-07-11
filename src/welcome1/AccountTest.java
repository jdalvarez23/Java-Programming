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

// Fig. 3.6: AccountTest.java
// Using the Account constructor to initialize the name instance
// variable at the time each Account object is created.

public class AccountTest {
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
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1's balance
        // display balances
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
        
        System.out.print("Enter deposit amount for account2: "); // prompt 
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2's balance
        
        // display balances
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
        
//        
//        // create an Account object and assign it to myAccount
//        Account myAccount = new Account();
//        
//        // display initial value of name (null)
//        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
//        
//        // prompt for and read name
//        System.out.println("Please enter the name:");
//        String theName = input.nextLine(); // read a line of text
//        myAccount.setName(theName); // put theName in myAccount
//        System.out.println(); // outputs a blank line
//        
//        System.out.println("Please enter the balance:");
//        double theBalance = input.nextDouble(); // read a line of integers
//        myAccount.deposit(theBalance);
//        System.out.println(); // outputs a blank title
//        
//        
//        // display the name stored in object myAccount
//        System.out.printf("Account name: %s%nAccount balance: %f%n", myAccount.getName());
    }
}
 
class Account {
    private String name; // instance variable
    private double balance; // instance variable
    
    // constructor initializes name with parameter name
    public Account(String name, double balance) { // constructor name is class name
        this.name = name;
        
        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }
    
    // method to set the name in the object
    public void setName(String name) {
        this.name = name; // store the name
    }
    
    //method to retrieve the name from the object
    public String getName() {
        return name; // return value of name to caller
    }
    
    // method to deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
        }
    }
    
    // method returns the account balance
    public double getBalance() {
        return balance;
    }
    
}
