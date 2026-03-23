package com.lcwd.rating.service;

import com.lcwd.rating.entity.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating createRating(Rating rating);
    //get all ratings
    List<Rating> getAllRatings();
    //get all by userId
    List<Rating> getAllRatingsByUserId(String userId);
    //get all by hotel id
    List<Rating> getAllRatingsByHotelId(String hotelId);
}
