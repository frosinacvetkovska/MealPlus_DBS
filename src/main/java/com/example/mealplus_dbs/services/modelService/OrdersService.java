package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.Orders;

import java.util.List;

public interface OrdersService {
    void insertCustomerOrder(Orders order);
    List<Orders> getAllCustomerOrders();
    Orders getCustomerOrderById(Long orderId);
    void placeCustomerOrder(Orders customerOrder);
    void updateCustomerOrder(Long orderId, Orders updatedCustomerOrder);
    void deleteCustomerOrder(Long orderId);
}
