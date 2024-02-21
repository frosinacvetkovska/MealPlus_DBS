package com.example.mealplus_dbs.services.modelService.modelImpl;

import com.example.mealplus_dbs.model.Meal;
import com.example.mealplus_dbs.model.enumerations.Category;
import com.example.mealplus_dbs.model.views.MealInfo;
import com.example.mealplus_dbs.repositories.MealRepository;
import com.example.mealplus_dbs.services.modelService.MealService;
import com.example.mealplus_dbs.services.viewService.MealInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImpl implements MealService {

    public final MealRepository mealRepository;

    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }


    @Override
    public Meal getMealById(Long mealId) {
        return mealRepository.findById(mealId).orElse(null);
    }

    @Override
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    @Override
    public void addMeal(Meal meal) {
        mealRepository.save(meal);
    }


}
