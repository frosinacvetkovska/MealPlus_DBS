package com.example.mealplus_dbs.model.reports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeeklySalesOfRestaurants {
    private String restaurantName;
    private Date weekStartDate;
    private BigDecimal totalSales;
}
