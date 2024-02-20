package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.Customer;

import java.util.List;

public interface CustomerService {
    void addCostumer(Customer customer);
    List<Customer> getAllCostumers();
}