package com.example.mealplus_dbs.repositories;

import com.example.mealplus_dbs.model.DailyMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyMenuRepository extends JpaRepository<DailyMenu, Long> {
}
