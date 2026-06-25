package com.deep.microservice.UserMicroservice.service;

import com.deep.microservice.UserMicroservice.entity.Hotel;
import com.deep.microservice.UserMicroservice.entity.Ratings;
import com.deep.microservice.UserMicroservice.entity.User;
import com.deep.microservice.UserMicroservice.exceptions.ResourceNotFoundException;
import com.deep.microservice.UserMicroservice.external.service.HotelService;
import com.deep.microservice.UserMicroservice.external.service.RatingService;
import com.deep.microservice.UserMicroservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private RatingService ratingService;




    @Override
    public User createUser(User user) {
        String userId = UUID.randomUUID().toString().replace("-","");


        user.setUserId(userId);

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        List<User> all = userRepository.findAll();
        all.stream().forEach(user -> {
//
            Ratings[] arrays = ratingService.getRatingsByUserId(user.getUserId());//restTemplate.getForObject("http://RatingService/api/ratings/users/" + user.getUserId(), Ratings[].class);
            log.info("{}",arrays);

            List<Ratings> list1 = Arrays.stream(arrays).toList();


            List<Ratings> list = list1.stream().map(rating -> {
                //Call Hotel Service and get the hotel
//
                Hotel forEntityBody = hotelService.getHotel(rating.getHotelId());//restTemplate.getForObject("http://HotelService/api/hotels/"+rating.getHotelId(), Hotel.class);
                System.out.println(forEntityBody);
                //Save the hotel object in ratings

                rating.setHotels(forEntityBody);
                //return the ratings

                return rating;

            }).toList();

            user.setRatings(list);
        });


        return all;
    }

    @Override
    public User getUserById(String userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id not found on server !!" + userId));
//
        Ratings[] forObject =ratingService.getRatingsByUserId(user.getUserId()); //restTemplate.getForObject("http://RatingService/api/ratings/users/" + user.getUserId(), Ratings[].class);
        List<Ratings> ratingList = Arrays.stream(forObject).toList();
        List<Ratings> list = ratingList.stream().map(rating -> {
            //Call Hotel Service and get the hotel
//
            Hotel forEntityBody = hotelService.getHotel(rating.getHotelId());//restTemplate.getForObject("http://HotelService/api/hotels/"+rating.getHotelId(), Hotel.class);
            System.out.println(forEntityBody);
            //Save the hotel object in ratings

            rating.setHotels(forEntityBody);
            //return the ratings

            return rating;

        }).toList();



        user.setRatings(list);
        return user;
    }

    @Override
    public void deleteUserById(String userId) {

        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id not found on server !!" + userId));

        userRepository.delete(user);


    }

    @Override
    public User updateUserById(String userId, User newUser) {
        User oldUser = userRepository.findById((userId)).orElseThrow(() -> new ResourceNotFoundException("User with given id not found on server !!" + userId));


        oldUser.setName(newUser.getName());
        oldUser.setEmail(newUser.getEmail());
        oldUser.setAbout(newUser.getAbout());
        oldUser.setDob(newUser.getDob());
        oldUser.setAddress(newUser.getAddress());
        oldUser.setPhoneNumber(newUser.getPhoneNumber());


       return userRepository.save(oldUser);



    }

    @Override
    public User patchUserById(String userId, User newUser) {
        User oldUser = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id not found on server !!" + userId));

        if(newUser.getName() != null){
            oldUser.setName(newUser.getName());
        }
        if(newUser.getEmail() != null){
            oldUser.setEmail(newUser.getEmail());
        }
        if(newUser.getAbout() != null){
            oldUser.setAbout(newUser.getAbout());
        }
        if(newUser.getDob() != null){
            oldUser.setDob(newUser.getDob());
        }
        if(newUser.getAddress() != null){
            oldUser.setAddress(newUser.getAddress());
        }
        if(newUser.getPhoneNumber() != null){
            oldUser.setPhoneNumber(newUser.getPhoneNumber());
        }
        return userRepository.save(oldUser);
    }

    @Override
    public String getNameById(String userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id not found on server !!" + userId));
        return user.getName();

    }

}
