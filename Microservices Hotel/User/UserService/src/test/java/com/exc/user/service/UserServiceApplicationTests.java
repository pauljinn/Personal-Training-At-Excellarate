package com.exc.user.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.exc.user.service.entities.Rating;
import com.exc.user.service.external.RatingService;

@SpringBootTest
class UserServiceApplicationTests {
	@Autowired
	private RatingService ratingService;

	@Test
	void contextLoads() {
	}
	
	@Test
	void createRating() {
		Rating rating = Rating.builder().rating(10).userId("").feedback("this is test rating").hotelId("").build();
		Rating savedRating = ratingService.createRating(rating);
		System.out.println("New rating " + savedRating);
	}

}
