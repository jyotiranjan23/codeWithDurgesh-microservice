package com.lcwd.rating.controller;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RateController {
    @Autowired
    private RatingService ratingService;

    //create rating
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        return new ResponseEntity<>(ratingService.createRating(rating), HttpStatus.CREATED);
    }

    //get all ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings() {
        return new ResponseEntity<>(ratingService.getAllRatings(), HttpStatus.OK);
    }

    //get all ratings by user id
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getAllRatingsByUserId(@PathVariable String userId) {
        return new ResponseEntity<>(ratingService.getAllRatingsByUserId(userId), HttpStatus.OK);
    }

    //get all ratings by hotel id
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable String hotelId) {
        return new ResponseEntity<>(ratingService.getAllRatingsByHotelId(hotelId), HttpStatus.OK);
    }
    @DeleteMapping("/{ratingId}")
    public ResponseEntity<Void> deleteRating(@PathVariable String ratingId) {
        ratingService.deleteRating(ratingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
