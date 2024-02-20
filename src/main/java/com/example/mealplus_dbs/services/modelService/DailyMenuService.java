package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.DailyMenu;

import java.util.List;

public interface DailyMenuService {
    List<DailyMenu> getAllDailyMenus();
    DailyMenu getDailyMenuById(Long dailyMenuId);
    void saveDailyMenu(DailyMenu dailyMenu);
    void updateDailyMenu(Long dailyMenuId, DailyMenu updatedDailyMenu);
    void deleteDailyMenu(Long dailyMenuId);
}
