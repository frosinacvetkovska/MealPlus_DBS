package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.OrderMeal;

import java.util.List;

public interface OrderMealService {
    List<OrderMeal> getAllOrderMeals();
    OrderMeal getOrderMealById(Long orderMealId);
    void saveOrderMeal(OrderMeal orderMeal);
    void updateOrderMeal(Long orderMealId, OrderMeal updatedOrderMeal);
    void deleteOrderMeal(Long orderMealId);
}
