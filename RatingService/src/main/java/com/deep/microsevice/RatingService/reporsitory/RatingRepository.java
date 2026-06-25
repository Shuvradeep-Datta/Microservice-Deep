package com.deep.microsevice.RatingService.reporsitory;

import com.deep.microsevice.RatingService.entity.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RatingRepository extends JpaRepository<Ratings,String> {

    List<Ratings> findRatingsByUserId(String userId);
    List<Ratings> findRatingsByHotelId(String hotelId);



}
