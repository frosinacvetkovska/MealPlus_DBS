package com.example.mealplus_dbs.repositories.views;

import com.example.mealplus_dbs.model.views.OrderList;
import com.example.mealplus_dbs.model.views.RestaurantInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantInfoRepository extends JpaRepository<RestaurantInfo, Long> {
    @Query(value = "SELECT * FROM restaurant_info", nativeQuery = true)
    List<RestaurantInfo> listAllRestaurants();
}
