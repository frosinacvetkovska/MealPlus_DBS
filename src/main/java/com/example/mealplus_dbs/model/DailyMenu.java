package com.example.mealplus_dbs.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "daily_menu")
@Entity
public class DailyMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dailyMenuId;

    @ManyToOne
    @JoinColumn(name = "meal_id", referencedColumnName = "meal_id", nullable = false)
    private Meal meal;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    public DailyMenu() {
    }

    public DailyMenu(Long dailyMenuId, Meal meal, Restaurant restaurant) {
        this.dailyMenuId = dailyMenuId;
        this.meal = meal;
        this.restaurant = restaurant;
    }
}
