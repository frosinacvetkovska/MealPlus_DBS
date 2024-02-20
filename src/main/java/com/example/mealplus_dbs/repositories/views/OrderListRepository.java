package com.example.mealplus_dbs.repositories.views;

import com.example.mealplus_dbs.model.views.MealInfo;
import com.example.mealplus_dbs.model.views.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderListRepository extends JpaRepository<OrderList, Long> {
    @Query(value = "SELECT * FROM order_list", nativeQuery = true)
    List<OrderList> listAllOrders();
}
