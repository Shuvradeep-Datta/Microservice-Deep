package com.deep.microservice.UserMicroservice.external.service;

import com.deep.microservice.UserMicroservice.entity.Ratings;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "RatingService")
public interface RatingService {

    @GetMapping("/api/ratings/users/{userId}")
    public Ratings[] getRatingsByUserId(@PathVariable String userId);

    @PostMapping("/api/ratings")
    public Ratings createRating(Ratings ratings);


}
