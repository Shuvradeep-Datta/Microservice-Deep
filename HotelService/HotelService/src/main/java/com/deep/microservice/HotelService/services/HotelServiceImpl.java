package com.deep.microservice.HotelService.services;

import com.deep.microservice.HotelService.entity.Hotel;
import com.deep.microservice.HotelService.exception.ResourceNotFoundException;
import com.deep.microservice.HotelService.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository repository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString().replace("-","");

        hotel.setId(id);

        return repository.save(hotel);

    }

    @Override
    public List<Hotel> getHotel() {
       return  repository.findAll();

    }

    @Override
    public Hotel getHotelById(String id) {
       return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel is not found"+id));
    }

    @Override
    public Hotel updateHotel(String id, Hotel newHotel) {
        Hotel oldHotel = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel is not found"+id));

        oldHotel.setName(newHotel.getName());
        oldHotel.setAbout(newHotel.getAbout());
        oldHotel.setLocation(newHotel.getLocation());


       return repository.save(oldHotel);



    }

    @Override
    public void deleteHotel(String id) {
        Hotel oldHotel = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel is not found"+id));
        repository.delete(oldHotel);

    }

    @Override
    public Hotel patchHotel(String id, Hotel newHotel) {
        Hotel oldHotel = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel is not found"+id));

        if (newHotel.getName() != null){
            oldHotel.setName(newHotel.getName());
        }
        if (newHotel.getAbout() != null){
            oldHotel.setAbout(newHotel.getAbout());
        }
        if (newHotel.getLocation() != null){
            oldHotel.setLocation(newHotel.getLocation());
        }




        return repository.save(oldHotel);
    }
}
