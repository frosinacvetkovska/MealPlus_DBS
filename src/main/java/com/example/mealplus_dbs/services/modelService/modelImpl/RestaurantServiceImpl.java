package com.example.mealplus_dbs.services.modelService.modelImpl;

import com.example.mealplus_dbs.model.Restaurant;
import com.example.mealplus_dbs.repositories.RestaurantRepository;
import com.example.mealplus_dbs.services.modelService.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    public final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void addRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
