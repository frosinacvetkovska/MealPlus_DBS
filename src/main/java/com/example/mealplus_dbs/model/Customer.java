package com.example.mealplus_dbs.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Table(name = "customer")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "name", nullable = false)
    private String customerName;

    @Column(name = "surname", nullable = false)
    private String customerSurname;

    @Column(name = "email_address", nullable = false)
    private String customerEmail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "password", nullable = false)
    private String customerPassword;

    @Column(name = "adress", nullable = false)
    private String customerAdress;

    public Customer(Long customerId) {
        this.customerId = customerId;
    }

    public Customer(String customerName, String customerSurname, String customerEmail, String phoneNumber, String customerPassword, String customerAdress) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        this.customerPassword = customerPassword;
        this.customerAdress = customerAdress;
    }

    public Customer(Long customerId, String customerName, String customerSurname, String customerEmail, String phoneNumber, String customerPassword, String customerAdress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        this.customerPassword = customerPassword;
        this.customerAdress = customerAdress;
    }

    public Customer() {
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }
}
