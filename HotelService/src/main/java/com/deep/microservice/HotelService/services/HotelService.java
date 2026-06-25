package com.deep.microservice.HotelService.services;

import com.deep.microservice.HotelService.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HotelService {


    //Create Hotel
    Hotel createHotel(Hotel hotel);



    //Get Hotel
    List<Hotel> getHotel();


    //Get Single Hotel
    Hotel getHotelById(String hotelId);


    //Update Hotel
    Hotel updateHotel(String id,Hotel hotel);

    //Delete Hotel
    void deleteHotel(String id);

    //Patch Hotel
    Hotel patchHotel(String id,Hotel hotel);
}
