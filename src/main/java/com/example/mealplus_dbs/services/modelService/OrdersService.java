package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.Orders;
import com.example.mealplus_dbs.model.reports.MonthlyOrdersForClient;
import com.example.mealplus_dbs.model.reports.WeeklySalesOfRestaurants;
import com.example.mealplus_dbs.model.reports.YearlyPopularDailyMenu;

import java.util.List;

public interface OrdersService {
    void insertCustomerOrder(Orders order);
    List<Orders> getAllCustomerOrders();
    Orders getCustomerOrderById(Long orderId);
    void updateCustomerOrder(Long orderId, Orders updatedCustomerOrder);
    void deleteCustomerOrder(Long orderId);
    List<WeeklySalesOfRestaurants> getWeeklyReport();
    List<MonthlyOrdersForClient> getMonthlyReport();
    List<YearlyPopularDailyMenu> getYearlyReport();
}
