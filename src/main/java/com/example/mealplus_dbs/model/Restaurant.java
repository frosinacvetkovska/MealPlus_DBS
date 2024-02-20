package com.example.mealplus_dbs.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
@Table(name = "restaurant")
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column(name = "name", nullable = false)
    private String restaurantName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "working_from", nullable = false)
    private LocalTime workingFrom;

    @Column(name = "working_till", nullable = false)
    private LocalTime workingTill;

    @ElementCollection
    @Column(name = "location", nullable = false)
    private List<String> restaurantLocations;

    @Column(name = "description")
    private String restaurantDescription;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private RestaurantAccount restaurantAccount;

    public Restaurant(String restaurantName, String phoneNumber, LocalTime workingFrom, LocalTime workingTill, List<String> restaurantLocations, String restaurantDescription, RestaurantAccount restaurantAccount) {
        this.restaurantName = restaurantName;
        this.phoneNumber = phoneNumber;
        this.workingFrom = workingFrom;
        this.workingTill = workingTill;
        this.restaurantLocations = restaurantLocations;
        this.restaurantDescription = restaurantDescription;
        this.restaurantAccount = restaurantAccount;
    }

    public List<String> getRestaurantLocations() {
        return restaurantLocations;
    }

    public void setRestaurantLocations(List<String> restaurantLocations) {
        this.restaurantLocations = restaurantLocations;
    }

    public Restaurant() {
    }
}
