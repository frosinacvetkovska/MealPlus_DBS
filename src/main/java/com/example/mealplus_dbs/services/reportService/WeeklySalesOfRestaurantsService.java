package com.example.mealplus_dbs.services.reportService;

import com.example.mealplus_dbs.model.reports.WeeklySalesOfRestaurants;

import java.util.List;

public interface WeeklySalesOfRestaurantsService {
    List<WeeklySalesOfRestaurants> getWeeklyReportOfRestaurants();
}
