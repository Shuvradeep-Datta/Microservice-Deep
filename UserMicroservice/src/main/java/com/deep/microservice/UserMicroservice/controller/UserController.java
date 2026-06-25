package com.deep.microservice.UserMicroservice.controller;

import com.deep.microservice.UserMicroservice.entity.User;
import com.deep.microservice.UserMicroservice.payload.DeleteResponse;
import com.deep.microservice.UserMicroservice.service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    private int retryCount = 1;

    //Create
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> createUser(@RequestBody User user){
        User createUser = userService.createUser(user);
        return new ResponseEntity<>(createUser,HttpStatus.CREATED);
    }

    //Get all user
    @GetMapping
    @CircuitBreaker(name = "getAllCircuitBreaker",fallbackMethod = "getAllFallBack")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return new ResponseEntity<>(allUser,HttpStatus.OK);
    }

    //Get single user by id
    @GetMapping("/{userId}")
    @CircuitBreaker(name = "ratingHotelBreaker",fallbackMethod = "ratingHotelFallback")
//    @Retry(name = "Retry-Service",fallbackMethod = "ratingHotelFallback")
//    @RateLimiter(name = "ratelimiterservice",fallbackMethod = "ratingHotelFallback")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
//        log.info("Get single user by id handler: UserController");
        log.info("Retrying the method : {}",retryCount);
        retryCount++;
        if (retryCount >3){
            retryCount = 1;
        }
        User userById = userService.getUserById(userId);
        return new ResponseEntity<>(userById,HttpStatus.OK);
    }


    public ResponseEntity<User> ratingHotelFallback(String userId, Exception ex){
        log.info("Either Hotel or Rating is down please check the Server. Contact your admin. "+ex.getMessage());
        User user = User.builder()
                .userId("123").name("Dummy Name").email("dumy@gmail.com").phoneNumber("0123456789").about("This is dummy name getting for Server issue.")
                    .build();
        return new ResponseEntity<>(user,HttpStatus.BAD_REQUEST);
    }


    public ResponseEntity<List<User>> getAllFallBack(Exception ex){
        log.info("Either Hotel or Rating is down please check the Server. Contact your admin. "+ex.getMessage());
        User user = User.builder()
                .userId("123").name("Dummy Name").email("dumy@gmail.com").phoneNumber("0123456789").about("This is dummy name getting for Server issue.")
                .build();
        User user1 = User.builder()
                .userId("234").name("Dummy Name1").email("dumy1@gmail.com").phoneNumber("9476174576").about("This is dummy name getting for Server issue.")
                .build();
        List<User> userList = List.of(user,user1);
        return new ResponseEntity<>(userList,HttpStatus.OK);


    }

    //Delete user by id
    @DeleteMapping("/{userId}")
    public ResponseEntity<DeleteResponse> deleteUserById(@PathVariable String userId){
        String name = userService.getNameById(userId);

        String firstName = name.substring(0, name.indexOf(" "));


        userService.deleteUserById(userId);




        DeleteResponse deleteResponse = DeleteResponse.builder()
                .message("User deleted successfully !! User name is: "+firstName)
                .success(true)
                .status(200)
                .build();
        return new ResponseEntity<>(deleteResponse,HttpStatus.OK);
    }

    //Update user by id
    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUserById(@PathVariable String userId,@RequestBody User user) {
        User updateUser = userService.updateUserById(userId, user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }


    //Patch User by id
    @PatchMapping("/{userId}")
    public ResponseEntity<User> patchUserById(@PathVariable String userId, @RequestBody User user) {
        User patchUser = userService.patchUserById(userId, user);
        return new ResponseEntity<>(patchUser, HttpStatus.OK);
    }
}



//localhost:8083/api/ratings/users/e9a1ea12bd7b422da900692a5a06a50c
