/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeTest;

/**
 *
 * @author jalvarez343
 */

// Exercise 3.13

public class Employee {
    private String firstName; // instance variable
    private String lastName; // instance variable
    private double monthlySalary; // instance variable
    
    // Employee constructor that receives three parameters
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName; // assign first name to instance variable firstName
        this.lastName = lastName; // assign  last name to instance variable lastName
        
        // validate that the monthly salary is greater than 0; if it's not,
        // instance variable monthlySalary keeps its default initial value of 0
        if (monthlySalary > 0) { // if the monthly salary is valid
            this.monthlySalary = monthlySalary; // assign it to instance variable monthlySalary
        }
        
    }
    
    // method that returns employee first name
    public String getFirstName() {
        return firstName;
    }
    
    // method that sets employee first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // method that returns employee last name
    public String getLastName() {
        return this.lastName;
    }
    
    // method that sets employee last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // method that returns employee salary
    public double getMonthlySalary() {
        return this.monthlySalary;
    }
    
    // method that sets employee salary
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) { // if monthly salary is valid
            this.monthlySalary = monthlySalary; // assign it to monthly salary
        }
    }
    
}
