package com.example.mealplus_dbs.services.modelService.modelImpl;

import com.example.mealplus_dbs.model.Rating;
import com.example.mealplus_dbs.repositories.RatingRepository;
import com.example.mealplus_dbs.services.modelService.RatingService;

public class RatingServiceImpl implements RatingService {

    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Rating getRatingById(Long ratingId) {
        return ratingRepository.findById(ratingId).orElse(null);
    }

    @Override
    public void insertRating(Rating rating) {
     ratingRepository.save(rating);
    }
}
