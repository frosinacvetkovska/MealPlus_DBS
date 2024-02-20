package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.Restaurant;

import java.util.List;

public interface RestaurantService {
    void addRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
}
