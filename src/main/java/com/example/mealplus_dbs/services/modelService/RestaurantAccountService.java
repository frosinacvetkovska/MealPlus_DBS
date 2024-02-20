package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.RestaurantAccount;

import java.util.List;

public interface RestaurantAccountService {
    List<RestaurantAccount> getAllRestaurantAccounts();
    RestaurantAccount getRestaurantAccountById(Long accountId);
    void saveRestaurantAccount(RestaurantAccount restaurantAccount);
    void updateRestaurantAccount(Long accountId, RestaurantAccount updatedRestaurantAccount);
    void deleteRestaurantAccount(Long accountId);
}
