package com.example.mealplus_dbs.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "rating")
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id")
    private Long ratingId;

    @Column(name = "grade", nullable = false)
    private int grade;

    @Column(name = "rating_text")
    private String ratingText;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "meal_id", referencedColumnName = "meal_id", nullable = false)
    private Meal meal;

    public Rating(int grade, String ratingText, Customer customer, Meal meal) {
        this.grade = grade;
        this.ratingText = ratingText;
        this.customer = customer;
        this.meal = meal;
    }

    public Rating() {
    }
}
