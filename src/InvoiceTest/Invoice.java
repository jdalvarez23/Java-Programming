/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceTest;

/**
 *
 * @author jalvarez343
 */

// Exercise 3.12

public class Invoice {
    private String number; // instance variable
    private String description; // instance variable
    private int quantity; // instance variable
    private double price; // instance variable
    
    // Account constructor that receives two parameters
    public Invoice(String number, String description, int quantity, double price) {
        this.number = number; // assign part number to instance variable number
        this.description = description; // assign  description to instance variable description
        
        // validate that the quantity is greater than 0; if it's not,
        // instance variable quantity keepts its default initial value of 0
        if (quantity > 0) { // if the quantity is valid
            this.quantity = quantity; // assign it to instance variable quantity
        }
        
        // validate that the price is greater than 0.0; if it's not,
        // instance variable price keepts its default initial value of 0.0
        if (price > 0.0) { // if the quantity is valid
            this.price = price; // assign it to instance variable price
        }
        
    }
    
    // method that returns part number
    public String getNumber() {
        return number;
    }
    
    // method that sets part number
    public void setNumber(String number) {
        this.number = number;
    }
    
    // method that returns part description
    public String getDescription() {
        return description;
    }
    
    // method that sets part description
    public void setDescription(String description) {
        this.description = description;
    }
    
    // method that returns part quantity
    public int getQuantity() {
        return quantity;
    }
    
    // method that sets part quantity
    public void setQuantity(int quantity) {
        if (quantity >= 0) { // if quantity is valid
            this.quantity = quantity; // assign it to part quantity
        }
    }
    
    // method that returns part price
    public double getPrice() {
        return price;
    }
    
    // method that sets only a valid part price
    public void setPrice(double price) {
        if (price >= 0.0) { // if price is valid
            this.price = price; // assign it to part price
        }
    }
    
    // method that calculates invoice amount and returns amount as double value
    public double getInvoiceAmount() {
        return (this.quantity * this.price);
    }
    
}
