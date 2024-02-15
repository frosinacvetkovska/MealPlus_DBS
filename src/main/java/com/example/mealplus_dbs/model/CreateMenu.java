package com.example.mealplus_dbs.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class CreateMenu {
    @ManyToOne
    @JoinColumn(name = "meal_id", referencedColumnName = "meal_id", nullable = false)
    private Meal meal;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "restaurant_id", nullable = false)
    private Restaurant restaurant;


}
