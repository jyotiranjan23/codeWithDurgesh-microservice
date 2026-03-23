package com.lcwd.hotel.service;

import com.lcwd.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {
    //Create
    Hotel create(Hotel hotel);

    //getAll
    List<Hotel> getAll();

    //get Single
    Hotel getHotel(String id);
}
