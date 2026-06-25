package com.deep.microsevice.RatingService.services;

import com.deep.microsevice.RatingService.entity.Ratings;
import com.deep.microsevice.RatingService.reporsitory.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
@Component
public class RatingServiceImpl implements RatingService{

    @Autowired
    private RatingRepository repository;

    @Override
    public Ratings createRatings(Ratings ratings) {
        String ratingId = UUID.randomUUID().toString().replace("-", "");
       ratings.setRatingId(ratingId);

        return repository.save(ratings);
    }

    @Override
    public List<Ratings> getAllRatings() {
        List<Ratings> all = repository.findAll();
        return all;
    }

    @Override
    public List<Ratings> getAllRatingsByUserId(String userId) {
        return repository.findRatingsByUserId(userId);
    }

    @Override
    public List<Ratings> getAllRatingsByHotelId(String hotelId) {
        return repository.findRatingsByHotelId(hotelId);
    }
}
