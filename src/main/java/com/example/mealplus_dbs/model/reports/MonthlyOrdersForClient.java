package com.example.mealplus_dbs.model.reports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyOrdersForClient {
    private String customerName;
    private Date monthStartDate;
    private BigDecimal totalOrders;
}
