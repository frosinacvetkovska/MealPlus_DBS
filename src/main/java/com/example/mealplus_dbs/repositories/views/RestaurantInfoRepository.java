package com.example.mealplus_dbs.repositories.views;

import com.example.mealplus_dbs.model.views.RestaurantInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantInfoRepository extends JpaRepository<RestaurantInfo, String> {
}
