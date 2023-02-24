package com.exc.rating.service;

import java.util.List;

import com.exc.rating.entities.Rating;

public interface RatingService {
	
	//Create
	Rating create(Rating rating);
	
	//Get all ratings.
	List<Rating> getRatings();
	
	//Get all ratings given by a user
	List<Rating> getRatingsOfUser(String userId);
	
	//Get all ratings given to a hotel
	List<Rating> getRatingsOfHotel(String hoteId);
}
