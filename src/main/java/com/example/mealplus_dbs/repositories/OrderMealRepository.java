package com.example.mealplus_dbs.repositories;

import com.example.mealplus_dbs.model.OrderMeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMealRepository extends JpaRepository<OrderMeal, Long> {
}
