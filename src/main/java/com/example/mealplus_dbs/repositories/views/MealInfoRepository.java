package com.example.mealplus_dbs.repositories.views;

import com.example.mealplus_dbs.model.views.MealInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealInfoRepository extends JpaRepository<MealInfo, Long> {
    @Query(value = "SELECT * FROM meal_info", nativeQuery = true)
    List<MealInfo> listAllMeals();
}
