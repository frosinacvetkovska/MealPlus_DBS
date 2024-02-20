package com.example.mealplus_dbs.services.viewService.viewsImpl;

import com.example.mealplus_dbs.model.views.RestaurantInfo;
import com.example.mealplus_dbs.repositories.views.RestaurantInfoRepository;
import com.example.mealplus_dbs.services.viewService.RestaurantInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantInfoServiceImpl implements RestaurantInfoService {

    private final RestaurantInfoRepository restaurantInfoRepository;

    public RestaurantInfoServiceImpl(RestaurantInfoRepository restaurantInfoRepository) {
        this.restaurantInfoRepository = restaurantInfoRepository;
    }

    @Override
    public List<RestaurantInfo> getAllRestaurants() {
        return this.restaurantInfoRepository.listAllRestaurants();
    }
}
