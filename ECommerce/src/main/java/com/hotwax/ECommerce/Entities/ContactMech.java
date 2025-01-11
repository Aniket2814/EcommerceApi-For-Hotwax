package com.hotwax.ECommerce.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Contact_Mech")
public class ContactMech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_mech_id")
    private int contactMechId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "street_address", nullable = false, length = 100)
    private String streetAddress;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "state", nullable = false, length = 50)
    private String state;

    @Column(name = "postal_code", nullable = false, length = 20)
    private String postalCode;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "email", length = 100)
    private String email;

    // Getters and setters
    public int getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(int contactMechId) {
        this.contactMechId = contactMechId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
