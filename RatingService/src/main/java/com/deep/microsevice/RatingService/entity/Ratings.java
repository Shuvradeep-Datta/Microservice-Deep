package com.deep.microsevice.RatingService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ratings")
public class Ratings {

    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    @Lob
    private String feedback;

}
