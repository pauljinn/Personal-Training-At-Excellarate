package com.exc.user.service.services;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.exc.user.service.entities.Hotel;
import com.exc.user.service.entities.Rating;
import com.exc.user.service.entities.User;
import com.exc.user.service.exceptions.ResourceNotFoundException;
import com.exc.user.service.external.HotelService;
import com.exc.user.service.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private HotelService hotelService;

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Override
	public User saveUser(User user) {
		String id = UUID.randomUUID().toString();
		user.setUserId(id);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) throws ResourceNotFoundException {
		User user = userRepository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User with given Id is not found on Server!! :" + userId));
		// Get ratings given by user.
		String userRatingLink = "http://rating-service/ratings/users/" + userId;
		Rating[] ratingArr = restTemplate.getForObject(userRatingLink, Rating[].class);
		List<Rating> ratings = Arrays.stream(ratingArr).toList();
		logger.info("{}", ratings);
		List<Rating> hotelInjectedRating = ratings.stream().map((rating) -> {
			// ResponseEntity<Hotel> hotelResponse = restTemplate.getForEntity("http://hotel-service/hotel/" +rating.getHotelId(), Hotel.class);

			/**
			 * Using Feign client instead of Rest Template
			 */

//			logger.info("response status code : {}", hotelResponse.getStatusCode());
			//hotelResponse.getBody();
			Hotel hotel = hotelService.getHotel(rating.getHotelId());
			rating.setHotel(hotel);
			return rating;
		}).collect(Collectors.toList());

		user.setRatings(hotelInjectedRating);
		return user;
	}

}
