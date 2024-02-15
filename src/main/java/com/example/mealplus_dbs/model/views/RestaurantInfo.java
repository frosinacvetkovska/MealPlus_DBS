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
@Table(name = "restaurant_info")
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantInfo {
    @Id
    private Integer restaurantId;
    private String restaurantName;
    private String restaurantLocation;
    private String restaurantDescription;
    private Double averageGrade;
}
