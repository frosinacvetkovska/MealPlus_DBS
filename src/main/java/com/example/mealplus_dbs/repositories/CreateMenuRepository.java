package com.example.mealplus_dbs.repositories;

import com.example.mealplus_dbs.model.CreateMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateMenuRepository extends JpaRepository<CreateMenu, Long> {
}
