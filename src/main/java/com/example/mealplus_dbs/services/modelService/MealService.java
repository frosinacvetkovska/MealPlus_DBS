package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.Meal;
import com.example.mealplus_dbs.model.Restaurant;
import com.example.mealplus_dbs.model.enumerations.Category;

import java.util.List;

public interface MealService {
    Meal getMealById(Long mealId);
    List<Meal> getAllMeals();
    void addMeal(Meal meal);
}
