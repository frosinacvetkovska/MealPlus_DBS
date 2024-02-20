package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.Meal;
import com.example.mealplus_dbs.model.enumerations.Category;

import java.util.List;

public interface MealService {
    Meal getMealById(Integer id);
    List<Meal> getAllMeals();
    void insertMeal(String mealName, String mealDescription, Double mealPrice, Double mealDiscount, Category category, String mealPicture);
}
