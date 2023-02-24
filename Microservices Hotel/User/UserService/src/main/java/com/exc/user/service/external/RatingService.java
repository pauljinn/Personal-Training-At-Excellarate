package com.exc.user.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.exc.user.service.entities.Rating;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
	@PostMapping("/ratings/")
	Rating createRating(Rating values);
}
