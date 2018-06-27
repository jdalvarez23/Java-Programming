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

// Exercise 4.20

public class Ch4Exercise20 {
      // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        double grossPay = 0.00; // initialize employee gross pay
        int hoursWorked = 0; // initialize number of worked hours
        double hourlyRate = 0.00; // initialize hourly rate of employee
        int employeeCounter = 0; // initialize employee counter
        
        // processing phase
        System.out.print("Enter 1 to insert employee salary data or -1 to quit: "); // prompt for input
        int insertDataSentinel = input.nextInt(); // obtain user input
        
        // loop until sentinel value reads from user
        while ((insertDataSentinel != -1) && (insertDataSentinel == 1)) {
            System.out.print("Enter number hours worked last week by employee: "); // prompt for input
            hoursWorked = input.nextInt(); // obtain user input
            
            System.out.print("Enter employee hourly rate: "); // prompt for input
            hourlyRate = input.nextInt(); // obtain user input
            
            double excessHourlyRate = hourlyRate + (hourlyRate / 2); // divide to find overtime hourly rate
            
            employeeCounter++; // increment employee counter
            
            if (hoursWorked <= 40 ) { // if hours is less than or equal to 40
                grossPay = hourlyRate * hoursWorked; // multiply hours worked by hourly rate
            } else if (hoursWorked > 40) { // if hours is greater than 40
                int excessHoursWorked = hoursWorked - 40; // subtract to find excess hours (overtime)
                grossPay = (hourlyRate * 40) + (excessHourlyRate * excessHoursWorked); // gross pay in overtime
            }
            
            // display information
            System.out.printf("%nExtracting data for employee #%d...%n", employeeCounter);
            System.out.printf("-------------------------------------%n");
            System.out.printf("Hours worked: %d%n", hoursWorked);
            System.out.printf("Excess hours worked (overtime): %d%n", hoursWorked - 40);
            System.out.printf("Hourly rate: $%.2f%n", hourlyRate);
            System.out.printf("Excess hourly rate (overtime rate): $%.2f%n", excessHourlyRate);
            System.out.printf("------------------------------------%n");
            System.out.printf("Gross pay for employee #%d: $%.2f%n%n", employeeCounter, grossPay);
            
            // reset instance variables
            grossPay = 0.00; // initialize employee gross pay
            hoursWorked = 0; // initialize number of worked hours
            hourlyRate = 0.00; // initialize hourly rate of employee
            
            System.out.print("Enter 1 to insert employee salary data or -1 to quit: "); // prompt for input
            insertDataSentinel = input.nextInt(); // obtain user input
        }
        
        // termination phase
        if (employeeCounter != 0) { // if user quits
            // display information
            System.out.printf("%nTerminating process...%n");
            System.out.printf("-------------------------------------%n");
        } else { // if no items were inserted
            System.out.println("No employee data entered.");
        }
        
    }
}
