package com.deep.microservice.UserMicroservice.external.service;

import com.deep.microservice.UserMicroservice.entity.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HotelService")
public interface HotelService {

    @GetMapping("/api/hotels/{id}")
    Hotel getHotel(@PathVariable  String id);
}
