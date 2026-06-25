package com.deep.microsevice.RatingService.services;

import com.deep.microsevice.RatingService.entity.Ratings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create Rating
    Ratings createRatings(Ratings ratings);



    //get all ratings
    List<Ratings> getAllRatings();


    //get all ratings by userId
    List<Ratings> getAllRatingsByUserId(String userId);


    //get all ratings by hotelId
    List<Ratings> getAllRatingsByHotelId(String hotelId);
}
