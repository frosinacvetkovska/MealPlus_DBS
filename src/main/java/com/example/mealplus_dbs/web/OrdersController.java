package com.example.mealplus_dbs.web;

import com.example.mealplus_dbs.model.OrderMeal;
import com.example.mealplus_dbs.model.Orders;
import com.example.mealplus_dbs.services.modelService.OrderMealService;
import com.example.mealplus_dbs.services.modelService.OrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersService ordersService;
    private final OrderMealService orderMealService;

    public OrdersController(OrdersService ordersService, OrderMealService orderMealService) {
        this.ordersService = ordersService;
        this.orderMealService = orderMealService;
    }

    @GetMapping("/all")
    public String getAllOrders(Model model) {
        List<Orders> allOrders = ordersService.getAllCustomerOrders();
        model.addAttribute("orders", allOrders);
        return "allOrders"; // Thymeleaf template for displaying all orders
    }

    @GetMapping("/{orderId}")
    public String getOrderDetails(@PathVariable Long orderId, Model model) {
        Orders order = ordersService.getCustomerOrderById(orderId);
        model.addAttribute("order", order);
        return "orderDetails"; // Thymeleaf template for displaying order details
    }

    @PostMapping("/add")
    public String addOrder(@ModelAttribute("newOrder") Orders newOrder) {
        ordersService.insertCustomerOrder(newOrder);
        return "redirect:/orders/all";
    }

    @GetMapping("/delete/{orderId}")
    public String deleteOrder(@PathVariable Long orderId) {
        ordersService.deleteCustomerOrder(orderId);
        return "redirect:/orders/all";
    }

    @GetMapping("/orderMeals")
    public String getAllOrderMeals(Model model) {
        List<OrderMeal> allOrderMeals = orderMealService.getAllOrderMeals();
        model.addAttribute("orderMeals", allOrderMeals);
        return "allOrderMeals"; // Thymeleaf template for displaying all order meals
    }

    @GetMapping("/orderMeals/{orderMealId}")
    public String getOrderMealDetails(@PathVariable Long orderMealId, Model model) {
        OrderMeal orderMeal = orderMealService.getOrderMealById(orderMealId);
        model.addAttribute("orderMeal", orderMeal);
        return "orderMealDetails"; // Thymeleaf template for displaying order meal details
    }

    @PostMapping("/orderMeals/add")
    public String addOrderMeal(@ModelAttribute("newOrderMeal") OrderMeal newOrderMeal) {
        orderMealService.saveOrderMeal(newOrderMeal);
        return "redirect:/orders/orderMeals";
    }

    @GetMapping("/orderMeals/delete/{orderMealId}")
    public String deleteOrderMeal(@PathVariable Long orderMealId) {
        orderMealService.deleteOrderMeal(orderMealId);
        return "redirect:/orders/orderMeals";
    }
}
