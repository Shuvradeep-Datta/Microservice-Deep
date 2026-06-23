package com.deep.microservice.UserMicroservice;

import com.deep.microservice.UserMicroservice.entity.Ratings;
import com.deep.microservice.UserMicroservice.external.service.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserMicroserviceApplicationTests {

	@Autowired
	RatingService ratingService;

	@Test
	void contextLoads() {
	}


	@Test
	void testCreateUser() {
		Ratings ratings = Ratings.builder()
						.ratingId("123")
						.userId("456")
						.hotelId("789")
						.rating(5).feedback("Great service").build();

		Ratings rating = ratingService.createRating(ratings);
		System.out.println(rating.getRatingId());

	}

}
