package com.deep.microservice.UserMicroservice.service;

import com.deep.microservice.UserMicroservice.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    //Create
    User createUser(User user);


    //Get all user
    List<User> getAllUser();


    //Get single user by id
    User getUserById(String userId);

    //Delete user by id
    void deleteUserById(String userId);

    //Update user by id
    User updateUserById(String userId, User user);

    //Patch User by id
    User patchUserById(String userId, User user);

    String getNameById(String userId);
}
