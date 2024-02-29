package com.example.mealplus_dbs.web;

import com.example.mealplus_dbs.model.Rating;
import com.example.mealplus_dbs.services.modelService.RatingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
//@RequestMapping("/ratings")
//public class RatingController {
//
//    private final RatingService ratingService;
//
//    public RatingController(RatingService ratingService) {
//        this.ratingService = ratingService;
//    }
//
//    @GetMapping("/{ratingId}")
//    public String getRatingDetails(@PathVariable Long ratingId, Model model) {
//        Rating rating = ratingService.getRatingById(ratingId);
//        model.addAttribute("rating", rating);
//        return "ratingDetails";
//    }
//
//    @GetMapping("/add")
//    public String getAddRatingForm(Model model) {
//        model.addAttribute("newRating", new Rating());
//        return "addRatingForm";
//    }
//
//    @PostMapping("/add")
//    public String addRating(@ModelAttribute("newRating") Rating newRating) {
//        ratingService.insertRating(newRating);
//        return "redirect:/ratings";
//    }
//}
