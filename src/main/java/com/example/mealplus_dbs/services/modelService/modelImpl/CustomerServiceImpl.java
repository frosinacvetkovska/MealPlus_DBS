package com.example.mealplus_dbs.services.modelService.modelImpl;

import com.example.mealplus_dbs.model.Customer;
import com.example.mealplus_dbs.repositories.CustomerRepository;
import com.example.mealplus_dbs.services.modelService.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void addCostumer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCostumers() {
        return customerRepository.findAll();
    }
}
