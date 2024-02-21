package com.example.mealplus_dbs.services.modelService;

import com.example.mealplus_dbs.model.Rating;

public interface RatingService {
    Rating getRatingById(Long ratingId);
    void insertRating(Rating rating);
}
