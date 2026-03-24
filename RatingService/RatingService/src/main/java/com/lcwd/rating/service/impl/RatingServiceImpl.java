package com.lcwd.rating.service.impl;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.exception.ResourceNotFoundException;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId).orElseThrow(() -> new ResourceNotFoundException("No Ratings found with this userId: "+userId));
    }

    @Override
    public List<Rating> getAllRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId).orElseThrow(() -> new ResourceNotFoundException("No Ratings found with this hotelId: "+hotelId));
    }

    @Override
    public void deleteRating(String ratingId) {
        Rating rating = ratingRepository.findById(ratingId).orElseThrow(() -> new ResourceNotFoundException("Rating not found with this id: "+ratingId));
        ratingRepository.delete(rating);
    }
}
