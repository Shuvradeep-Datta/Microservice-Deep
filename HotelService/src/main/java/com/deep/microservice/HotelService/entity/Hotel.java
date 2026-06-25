package com.deep.microservice.HotelService.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    private String id;
    @Column(name = "hotel_name",nullable = false)
    private String name;
    private String location;
    @Lob
    @Column(name = "hotel_about",length = 500)
    private String about;

}
