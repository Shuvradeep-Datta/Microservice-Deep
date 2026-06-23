package com.deep.microsevice.RatingService.controller;

import com.deep.microsevice.RatingService.entity.Ratings;
import com.deep.microsevice.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    //create Rating
    @PostMapping
    public ResponseEntity<Ratings> createRatings(@RequestBody  Ratings ratings){

        Ratings createRatings = ratingService.createRatings(ratings);

        return new ResponseEntity<>(createRatings, HttpStatus.CREATED);
    }

    //get all ratings
    @GetMapping
    public ResponseEntity<List<Ratings>> getAllRatings(){

        List<Ratings> allRatings = ratingService.getAllRatings();

        return new ResponseEntity<>(allRatings,HttpStatus.OK);
    }

    //get all ratings by userId
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Ratings>> getAllRatingsByUserId(@PathVariable String userId){
        List<Ratings> allRatingsByUserId = ratingService.getAllRatingsByUserId(userId);

        return new ResponseEntity<>(allRatingsByUserId,HttpStatus.OK);
    }

    //get all ratings by hotelId
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Ratings>> getAllRatingsByHotelId(@PathVariable String hotelId) {
        List<Ratings> allRatingsByHotelId = ratingService.getAllRatingsByHotelId(hotelId);
        return new ResponseEntity<>(allRatingsByHotelId, HttpStatus.OK);
    }
}
