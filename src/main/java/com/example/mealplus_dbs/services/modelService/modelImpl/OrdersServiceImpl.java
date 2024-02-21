package com.example.mealplus_dbs.services.modelService.modelImpl;

import com.example.mealplus_dbs.model.Orders;
import com.example.mealplus_dbs.model.reports.MonthlyOrdersForClient;
import com.example.mealplus_dbs.model.reports.WeeklySalesOfRestaurants;
import com.example.mealplus_dbs.model.reports.YearlyPopularDailyMenu;
import com.example.mealplus_dbs.repositories.OrdersRepository;
import com.example.mealplus_dbs.services.modelService.OrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;


    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public void insertCustomerOrder(Orders order) {
        ordersRepository.save(order);
    }

    @Override
    public List<Orders> getAllCustomerOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders getCustomerOrderById(Long orderId) {
        return ordersRepository.findById(orderId).orElse(null);
    }

    @Override
    public void updateCustomerOrder(Long orderId, Orders updatedCustomerOrder) {
        Orders existingOrder = getCustomerOrderById(orderId);
        if(existingOrder != null){
            existingOrder.setCustomer(updatedCustomerOrder.getCustomer());
            existingOrder.setOrderNumber(updatedCustomerOrder.getOrderNumber());
            existingOrder.setDateTime(updatedCustomerOrder.getDateTime());
            existingOrder.setQuantity(updatedCustomerOrder.getQuantity());
            existingOrder.setDeliveryTime(updatedCustomerOrder.getDeliveryTime());
            ordersRepository.save(existingOrder);
        }
    }

    @Override
    public void deleteCustomerOrder(Long orderId) {
        ordersRepository.deleteById(orderId);
    }
    //TODO
    @Override
    public List<WeeklySalesOfRestaurants> getWeeklyReport() {
        return null;
    }
    //TODO
    @Override
    public List<MonthlyOrdersForClient> getMonthlyReport() {
        return null;
    }
    //TODO
    @Override
    public List<YearlyPopularDailyMenu> getYearlyReport() {
        return null;
    }
}
