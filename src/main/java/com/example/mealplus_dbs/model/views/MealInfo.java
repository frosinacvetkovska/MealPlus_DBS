package com.example.mealplus_dbs.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Data
@Entity
@Immutable
@Table(name = "meal_info")
@NoArgsConstructor
@AllArgsConstructor
public class MealInfo {
    @Id
    private Long mealId;
    private String mealName;
    private Double mealPrice;
    private String mealDescription;
    private Double mealDiscount;
    private Integer restaurantId;
    private String restaurantName;
    private Integer dailyMenuId;
    private String dateMenu;
}
