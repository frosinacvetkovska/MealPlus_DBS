package com.example.mealplus_dbs.web;

import com.example.mealplus_dbs.model.views.MealInfo;
import com.example.mealplus_dbs.model.views.OrderList;
import com.example.mealplus_dbs.model.views.RestaurantInfo;
import com.example.mealplus_dbs.services.viewService.MealInfoService;
import com.example.mealplus_dbs.services.viewService.OrderListService;
import com.example.mealplus_dbs.services.viewService.RestaurantInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewsController {
    private final OrderListService orderListService;
    private final RestaurantInfoService restaurantInfoService;
    private final MealInfoService mealInfoService;

    public ViewsController(OrderListService orderListService, RestaurantInfoService restaurantInfoService, MealInfoService mealInfoService) {
        this.orderListService = orderListService;
        this.restaurantInfoService = restaurantInfoService;
        this.mealInfoService = mealInfoService;
    }

    @GetMapping("/orderList")
    public String getOrderList(Model model) {
        List<OrderList> orderLists = orderListService.getAllRestaurants();
        model.addAttribute("orderLists", orderLists);
        return "orderListTemplate"; // Thymeleaf template name without extension
    }

    @GetMapping("/restaurantInfo")
    public String getRestaurantInfo(Model model) {
        List<RestaurantInfo> restaurantInfos = restaurantInfoService.getAllRestaurants();
        model.addAttribute("restaurantInfos", restaurantInfos);
        return "restaurantInfoTemplate";
    }

    @GetMapping("/mealInfo")
    public String getMealInfo(Model model) {
        List<MealInfo> mealInfos = mealInfoService.getAllMeals();
        model.addAttribute("mealInfos", mealInfos);
        return "mealInfoTemplate";
    }
}
