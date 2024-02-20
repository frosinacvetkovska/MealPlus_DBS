package com.example.mealplus_dbs.services.reportService;

import com.example.mealplus_dbs.model.reports.MonthlyOrdersForClient;

import java.util.List;

public interface MonthlyOrdersForClientService {
    List<MonthlyOrdersForClient> getMonthlyOrdersForClients();
}
