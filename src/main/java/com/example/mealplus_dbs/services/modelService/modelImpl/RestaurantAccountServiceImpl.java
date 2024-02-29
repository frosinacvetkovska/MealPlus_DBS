package com.example.mealplus_dbs.services.modelService.modelImpl;

import com.example.mealplus_dbs.model.RestaurantAccount;
import com.example.mealplus_dbs.repositories.RestaurantAccountRepository;
import com.example.mealplus_dbs.services.modelService.RestaurantAccountService;

import java.util.List;

public class RestaurantAccountServiceImpl implements RestaurantAccountService {

    private final RestaurantAccountRepository restaurantAccountRepository;

    public RestaurantAccountServiceImpl(RestaurantAccountRepository restaurantAccountRepository) {
        this.restaurantAccountRepository = restaurantAccountRepository;
    }

    @Override
    public List<RestaurantAccount> getAllRestaurantAccounts() {
        return restaurantAccountRepository.findAll();
    }

    @Override
    public RestaurantAccount getRestaurantAccountById(Long accountId) {
        return restaurantAccountRepository.findById(accountId).orElse(null);
    }

    @Override
    public void saveRestaurantAccount(RestaurantAccount restaurantAccount) {
        restaurantAccountRepository.save(restaurantAccount);
    }
}
