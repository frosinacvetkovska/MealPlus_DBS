package com.example.mealplus_dbs.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "order_meal")
public class OrderMeal {
    @Id
    @Column(name = "orderMeal_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderMeal_id;

    @Column(name = "price", nullable = false)
    private float mealPrice;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "meal_id", nullable = false)
    private Meal meal;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order_id;

    public OrderMeal() {
    }

    public OrderMeal(Long orderMeal_id, float mealPrice, int quantity, Meal meal, Orders order_id) {
        this.orderMeal_id = orderMeal_id;
        this.mealPrice = mealPrice;
        this.quantity = quantity;
        this.meal = meal;
        this.order_id = order_id;
    }
}
