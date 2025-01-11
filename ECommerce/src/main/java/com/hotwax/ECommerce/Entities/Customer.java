package com.hotwax.ECommerce.Entities;
import jakarta.persistence.*;
@Entity
public class Customer {
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String firstName;
    private String lastName;

    public int getCustomerId() {
        return customerId;
    }

    // Getters and Setters
}

