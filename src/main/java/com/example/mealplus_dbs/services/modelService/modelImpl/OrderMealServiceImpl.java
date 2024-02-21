package com.example.mealplus_dbs.services.modelService.modelImpl;

import com.example.mealplus_dbs.model.OrderMeal;
import com.example.mealplus_dbs.repositories.OrderMealRepository;
import com.example.mealplus_dbs.services.modelService.OrderMealService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMealServiceImpl implements OrderMealService {

    private final OrderMealRepository orderMealRepository;

    public OrderMealServiceImpl(OrderMealRepository orderMealRepository) {
        this.orderMealRepository = orderMealRepository;
    }

    @Override
    public List<OrderMeal> getAllOrderMeals() {
        return orderMealRepository.findAll();
    }

    @Override
    public OrderMeal getOrderMealById(Long orderMealId) {
        return orderMealRepository.findById(orderMealId).orElse(null);
    }

    @Override
    public void saveOrderMeal(OrderMeal orderMeal) {
        orderMealRepository.save(orderMeal);
    }

    @Override
    public void updateOrderMeal(Long orderMealId, OrderMeal updatedOrderMeal) {
        OrderMeal existingOrderOrMeal = getOrderMealById(orderMealId);
        if(existingOrderOrMeal != null){
            existingOrderOrMeal.setMeal(updatedOrderMeal.getMeal());
            existingOrderOrMeal.setMealPrice(updatedOrderMeal.getMealPrice());
            existingOrderOrMeal.setQuantity(updatedOrderMeal.getQuantity());
            orderMealRepository.save(existingOrderOrMeal);
        }
    }

    @Override
    public void deleteOrderMeal(Long orderMealId) {
        orderMealRepository.deleteById(orderMealId);
    }
}
