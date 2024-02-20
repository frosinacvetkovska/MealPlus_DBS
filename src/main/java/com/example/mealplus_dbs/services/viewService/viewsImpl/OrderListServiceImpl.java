package com.example.mealplus_dbs.services.viewService.viewsImpl;

import com.example.mealplus_dbs.model.views.OrderList;
import com.example.mealplus_dbs.repositories.views.OrderListRepository;
import com.example.mealplus_dbs.services.viewService.OrderListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderListServiceImpl implements OrderListService {
    private final OrderListRepository orderListRepository;

    public OrderListServiceImpl(OrderListRepository orderListRepository) {
        this.orderListRepository = orderListRepository;
    }

    @Override
    public List<OrderList> getAllRestaurants() {
        return this.orderListRepository.listAllOrders();
    }
}
