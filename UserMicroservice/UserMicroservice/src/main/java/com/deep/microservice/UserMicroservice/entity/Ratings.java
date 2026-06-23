package com.deep.microservice.UserMicroservice.entity;

import jakarta.persistence.Transient;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Ratings {
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
    @Transient
    private Hotel hotels;
}
