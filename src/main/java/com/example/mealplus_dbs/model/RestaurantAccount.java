package com.example.mealplus_dbs.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "restaurant_account")
@Entity
public class RestaurantAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long restaurantAccountId;

    @Column(name = "email_address", nullable = false)
    private String restaurantEmail;

    @Column(name = "password", nullable = false)
    private String restaurantPassword;

    public RestaurantAccount(String restaurantEmail, String restaurantPassword) {
        this.restaurantEmail = restaurantEmail;
        this.restaurantPassword = restaurantPassword;
    }

    public RestaurantAccount(Long restaurantAccountId, String restaurantEmail, String restaurantPassword) {
        this.restaurantAccountId = restaurantAccountId;
        this.restaurantEmail = restaurantEmail;
        this.restaurantPassword = restaurantPassword;
    }

    public RestaurantAccount() {
    }

    public Long getRestaurantAccountId() {
        return restaurantAccountId;
    }

    public void setRestaurantAccountId(Long restaurantAccountId) {
        this.restaurantAccountId = restaurantAccountId;
    }

    public String getRestaurantEmail() {
        return restaurantEmail;
    }

    public void setRestaurantEmail(String restaurantEmail) {
        this.restaurantEmail = restaurantEmail;
    }

    public String getRestaurantPassword() {
        return restaurantPassword;
    }

    public void setRestaurantPassword(String restaurantPassword) {
        this.restaurantPassword = restaurantPassword;
    }
}
