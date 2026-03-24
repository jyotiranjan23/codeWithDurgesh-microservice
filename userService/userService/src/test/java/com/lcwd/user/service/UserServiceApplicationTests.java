package com.lcwd.user.service;

import com.lcwd.user.service.entity.Hotel;
import com.lcwd.user.service.entity.Rating;
import com.lcwd.user.service.externalService.RatingService;
import com.netflix.discovery.converters.Auto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {
	@Autowired
	private RatingService ratingService;

	@Test
	void contextLoads() {
	}
	@Test
	void createRating(){
		Hotel hotel = Hotel.builder().name("Mayfair").location("Bhubaneswar").about("Luxurious Hotel").build();
		Rating rating = Rating.builder().userId("10").hotelId("100").rating(4).hotel(hotel).build();
		Rating savedRating = ratingService.createRating(rating);
		System.out.println(savedRating);

	}


}
