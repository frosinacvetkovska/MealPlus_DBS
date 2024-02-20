package com.example.mealplus_dbs.repositories;

import com.example.mealplus_dbs.model.RestaurantAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantAccountRepository extends JpaRepository<RestaurantAccount, Long> {
}
