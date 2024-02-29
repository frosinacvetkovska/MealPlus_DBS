//package com.example.mealplus_dbs.web;
//
//import com.example.mealplus_dbs.model.Restaurant;
//import com.example.mealplus_dbs.model.RestaurantAccount;
//import com.example.mealplus_dbs.services.modelService.RestaurantAccountService;
//import com.example.mealplus_dbs.services.modelService.RestaurantService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/restaurants")
//public class RestaurantController {
//
//    private final RestaurantService restaurantService;
//    private final RestaurantAccountService restaurantAccountService;
//
//    public RestaurantController(RestaurantService restaurantService, RestaurantAccountService restaurantAccountService) {
//        this.restaurantService = restaurantService;
//        this.restaurantAccountService = restaurantAccountService;
//    }
//
//    @GetMapping
//    public String getAllRestaurants(Model model) {
//        List<Restaurant> restaurants = restaurantService.getAllRestaurants();
//        model.addAttribute("restaurants", restaurants);
//        return "restaurantList"; // Change this to your actual Thymeleaf template name
//    }
//
//    @GetMapping("/{restaurantId}")
//    public String getRestaurantDetails(@PathVariable Long restaurantId, Model model) {
//        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
//        model.addAttribute("restaurant", restaurant);
//        return "restaurantDetails"; // Change this to your actual Thymeleaf template name
//    }
//
//    @GetMapping("/add")
//    public String getAddRestaurantForm(Model model) {
//        model.addAttribute("newRestaurant", new Restaurant());
//        return "addRestaurantForm"; // Change this to your actual Thymeleaf template name
//    }
//
//    @PostMapping("/add")
//    public String addRestaurant(@ModelAttribute("newRestaurant") Restaurant newRestaurant) {
//        restaurantService.addRestaurant(newRestaurant);
//        return "redirect:/restaurants";
//    }
//
//    @GetMapping("/{restaurantId}/edit")
//    public String getEditRestaurantForm(@PathVariable Long restaurantId, Model model) {
//        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
//        model.addAttribute("editedRestaurant", restaurant);
//        return "editRestaurantForm"; // Change this to your actual Thymeleaf template name
//    }
//
////    @PostMapping("/{restaurantId}/edit")
////    public String editRestaurant(@PathVariable Long restaurantId, @ModelAttribute("editedRestaurant") Restaurant editedRestaurant) {
////        restaurantService.updateRestaurant(restaurantId, editedRestaurant);
////        return "redirect:/restaurants";
////    }
////
////    @GetMapping("/{restaurantId}/delete")
////    public String deleteRestaurant(@PathVariable Long restaurantId) {
////        restaurantService.deleteRestaurant(restaurantId);
////        return "redirect:/restaurants";
////    }
//
//    @GetMapping("/{restaurantId}/accounts")
//    public String getRestaurantAccounts(@PathVariable Long restaurantId, Model model) {
//        List<RestaurantAccount> accounts = restaurantAccountService.getAllRestaurantAccounts();
//        model.addAttribute("accounts", accounts);
//        return "restaurantAccounts"; // Change this to your actual Thymeleaf template name
//    }
//
//    @GetMapping("/accounts/{accountId}")
//    public String getRestaurantAccountDetails(@PathVariable Long accountId, Model model) {
//        RestaurantAccount account = restaurantAccountService.getRestaurantAccountById(accountId);
//        model.addAttribute("account", account);
//        return "restaurantAccountDetails"; // Change this to your actual Thymeleaf template name
//    }
//
//    @GetMapping("/{restaurantId}/accounts/add")
//    public String getAddRestaurantAccountForm(@PathVariable Long restaurantId, Model model) {
//        model.addAttribute("newAccount", new RestaurantAccount());
//        return "addRestaurantAccountForm"; // Change this to your actual Thymeleaf template name
//    }
//
//    @PostMapping("/{restaurantId}/accounts/add")
//    public String addRestaurantAccount(@PathVariable Long restaurantId, @ModelAttribute("newAccount") RestaurantAccount newAccount) {
//        restaurantAccountService.saveRestaurantAccount(newAccount);
//        return "redirect:/restaurants/{restaurantId}/accounts";
//    }
//}
//
