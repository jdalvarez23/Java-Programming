/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeTest;

import java.util.Scanner;

/**
 *
 * @author jalvarez343
 */
public class EmployeeTest {
    // main method begins execution of Java application
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 50000.00);
        Employee employee2 = new Employee("Jane", "Doe", 25000.00);
        
        // display employee #1 information
        System.out.printf("%nGathering employee data %n");
        System.out.printf("-------------------------------------%n");
        System.out.printf("Employee: %s %s%n", employee1.getFirstName(), employee1.getLastName());
        System.out.printf("Salary: $%.2f%n", employee1.getMonthlySalary());
        System.out.printf("-------------------------------------%n");
        
        // display employee #2 information
        System.out.printf("Employee: %s %s%n", employee2.getFirstName(), employee2.getLastName());
        System.out.printf("Salary: $%.2f%n", employee2.getMonthlySalary());
        System.out.printf("-------------------------------------%n");
        
         // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter new percent (%) increase in salary for employee 1: "); // prompt
        double percentSalary = input.nextDouble(); // obtain user input
        
        if (percentSalary >= 0) { // if new salary is valid
            double increaseSalary = employee1.getMonthlySalary() * (percentSalary / 100); // calculate the increase in salary for employee1
            double newSalary = employee1.getMonthlySalary() + increaseSalary; // calculate the new salary by adding increase to current salary
            employee1.setMonthlySalary(newSalary); // set new employee monthly salary 
            
        }
        
        System.out.print("Enter new percent (%) increase in salary for employee 2: "); // prompt
        percentSalary = input.nextDouble(); // obtain user input
        
        if (percentSalary >= 0) { // if new salary is valid
            double increaseSalary = employee2.getMonthlySalary() * (percentSalary / 100); // calculate the increase in salary for employee2
            double newSalary = employee2.getMonthlySalary() + increaseSalary; // calculate the new salary by adding increase to current salary
            employee2.setMonthlySalary(newSalary); // set new employee monthly salary 
            
        }
        
        // display new employee #1 information
        System.out.printf("%nGathering new employee data %n");
        System.out.printf("-------------------------------------%n");
        System.out.printf("Employee: %s %s%n", employee1.getFirstName(), employee1.getLastName());
        System.out.printf("Salary: $%.2f%n", employee1.getMonthlySalary());
        System.out.printf("-------------------------------------%n");
        
        // display new employee #2 information
        System.out.printf("Employee: %s %s%n", employee2.getFirstName(), employee2.getLastName());
        System.out.printf("Salary: $%.2f%n", employee2.getMonthlySalary());
        System.out.printf("-------------------------------------%n");
    }
}
