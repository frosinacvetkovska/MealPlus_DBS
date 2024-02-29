package com.example.mealplus_dbs.web;

import com.example.mealplus_dbs.model.Meal;
import com.example.mealplus_dbs.services.modelService.MealService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private final MealService mealService;

    public MenuController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping
    public String getMenu(Model model) {
        List<Meal> meals = mealService.getAllMeals();
        model.addAttribute("meals", meals);
        return "menu";
    }

    @GetMapping("/{mealId}")
    public String getMealDetails(@PathVariable Long mealId, Model model) {
        Meal meal = mealService.getMealById(mealId);
        model.addAttribute("meal", meal);
        return "mealDetails";
    }

    @GetMapping("/add")
    public String getAddMealForm(Model model) {
        model.addAttribute("newMeal", new Meal());
        return "addMealForm";
    }

    @PostMapping("/add")
    public String addMeal(@ModelAttribute("newMeal") Meal newMeal) {
        mealService.addMeal(newMeal);
        return "redirect:/menu";
    }
}
