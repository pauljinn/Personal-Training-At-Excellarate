package com.exc.hotel.services;

import java.util.List;

import com.exc.hotel.entities.Hotel;

public interface HotelService {
	//create
	Hotel create(Hotel hotel);
	
	//getAll
	List<Hotel> getAll();
	
	//getSingle
	Hotel get(String id);
}
