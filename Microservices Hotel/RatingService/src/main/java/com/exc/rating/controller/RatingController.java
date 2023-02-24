package com.exc.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exc.rating.entities.Rating;
import com.exc.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		Rating createdRating = ratingService.create(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdRating);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Rating>> getAllRatings(){
		List<Rating> allRatings = ratingService.getRatings();
		return ResponseEntity.ok(allRatings);
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingsOfUser(@PathVariable String userId){
		List<Rating> userRatings = ratingService.getRatingsOfUser(userId);
		return ResponseEntity.ok(userRatings);
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsOfHotel(@PathVariable String hotelId){
		List<Rating> hotelRatings = ratingService.getRatingsOfHotel(hotelId);
		return ResponseEntity.ok(hotelRatings);
	}
	
	
}
