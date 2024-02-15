package com.example.mealplus_dbs.model.reports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YearlyPopularDailyMenu {
    private Date menuDate;
    private String mealName;
    private BigDecimal totalOrders;

}
