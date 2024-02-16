package com.example.mealplus_dbs.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table(name = "\"order\"")
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "date_of_order", nullable = false)
    private LocalDateTime dateTime;

    @Column(name = "order_number", nullable = false)
    private Long orderNumber;

    @Column(name = " delivery_time")
    private LocalDateTime deliveryTime;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customer;

    public Orders(Long orderId, LocalDateTime dateTime, Long orderNumber, LocalDateTime deliveryTime, int quantity, Customer customer) {
        this.orderId = orderId;
        this.dateTime = dateTime;
        this.orderNumber = orderNumber;
        this.deliveryTime = deliveryTime;
        this.quantity = quantity;
        this.customer = customer;
    }

    public Orders(LocalDateTime dateTime, Long orderNumber, LocalDateTime deliveryTime, int quantity, Customer customer) {
        this.dateTime = dateTime;
        this.orderNumber = orderNumber;
        this.deliveryTime = deliveryTime;
        this.quantity = quantity;
        this.customer = customer;
    }

    public Orders() {
    }

}
