package com.exc.user.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.exc.user.service.entities.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {
	@GetMapping("/hotel/{hotelId}")
	Hotel getHotel(@PathVariable("hotelId") String hotelId);
}
