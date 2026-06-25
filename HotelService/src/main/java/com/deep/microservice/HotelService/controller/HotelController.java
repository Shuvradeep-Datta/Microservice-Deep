package com.deep.microservice.HotelService.controller;


import com.deep.microservice.HotelService.entity.Hotel;
import com.deep.microservice.HotelService.payload.DeleteResponse;
import com.deep.microservice.HotelService.services.HotelService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private HotelService service;

    //create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody  Hotel hotel){
        Hotel createHotel = service.createHotel(hotel);

        return new ResponseEntity<>(createHotel, HttpStatus.CREATED);
    }

    //get Hotel
    @GetMapping("/getAll")
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> hotels = service.getHotel();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }
    //get single hotel
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String id) {
        Hotel hotel = service.getHotelById(id);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }
    //update hotel
    @PutMapping("/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable String id,@RequestBody Hotel hotel) {
        Hotel updatedHotel = service.updateHotel(id, hotel);
        return new ResponseEntity<>(updatedHotel, HttpStatus.OK);
    }
    //delete hotel
    @DeleteMapping("/{id}")
    public ResponseEntity<DeleteResponse> deletHotel(@PathVariable String id) {
        service.deleteHotel(id);


        DeleteResponse response=
                DeleteResponse.builder()
                        .message("Hotel deleted successfully")
                        .success(true)
                        .status(HttpStatus.OK)
                        .build();

        return new ResponseEntity<>(response, HttpStatus.OK);


    }

    @PatchMapping("/{id}")
    public ResponseEntity<Hotel> patchHotel(@PathVariable String id,@RequestBody Hotel hotel) {
        Hotel patchedHotel = service.patchHotel(id, hotel);
        return new ResponseEntity<>(patchedHotel, HttpStatus.OK);
    }



}
