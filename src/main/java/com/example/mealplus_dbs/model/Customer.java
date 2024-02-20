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
}
