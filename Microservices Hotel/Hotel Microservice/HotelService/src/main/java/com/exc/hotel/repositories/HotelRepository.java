package com.exc.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exc.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
