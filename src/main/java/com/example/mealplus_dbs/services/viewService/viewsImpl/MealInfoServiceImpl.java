package com.example.mealplus_dbs.services.viewService.viewsImpl;

import com.example.mealplus_dbs.model.views.MealInfo;
import com.example.mealplus_dbs.repositories.views.MealInfoRepository;
import com.example.mealplus_dbs.services.viewService.MealInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealInfoServiceImpl implements MealInfoService {
    private final MealInfoRepository mealInfoRepository;

    public MealInfoServiceImpl(MealInfoRepository mealInfoRepository) {
        this.mealInfoRepository = mealInfoRepository;
    }

    @Override
    public List<MealInfo> getAllMeals() {
        return this.mealInfoRepository.listAllMeals();
    }
}
