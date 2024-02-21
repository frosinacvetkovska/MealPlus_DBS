package com.example.mealplus_dbs.services.modelService.modelImpl;

import com.example.mealplus_dbs.model.DailyMenu;
import com.example.mealplus_dbs.repositories.DailyMenuRepository;
import com.example.mealplus_dbs.services.modelService.DailyMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyMenuServiceImpl implements DailyMenuService {

    private final DailyMenuRepository dailyMenuRepository;

    public DailyMenuServiceImpl(DailyMenuRepository dailyMenuRepository) {
        this.dailyMenuRepository = dailyMenuRepository;
    }

    @Override
    public List<DailyMenu> getAllDailyMenus() {
        return dailyMenuRepository.findAll();
    }

    @Override
    public DailyMenu getDailyMenuById(Long dailyMenuId) {
        return dailyMenuRepository.findById(dailyMenuId).orElse(null);
    }

    @Override
    public void saveDailyMenu(DailyMenu dailyMenu) {
        dailyMenuRepository.save(dailyMenu);
    }

    @Override
    public void updateDailyMenu(Long dailyMenuId, DailyMenu updatedDailyMenu) {
        DailyMenu existingDailyMenu = getDailyMenuById(dailyMenuId);
        if(existingDailyMenu != null){
            existingDailyMenu.setMeal(updatedDailyMenu.getMeal());
            existingDailyMenu.setRestaurant(updatedDailyMenu.getRestaurant());
            dailyMenuRepository.save(existingDailyMenu);
        }
    }

    @Override
    public void deleteDailyMenu(Long dailyMenuId) {
        dailyMenuRepository.deleteById(dailyMenuId);
    }
}
