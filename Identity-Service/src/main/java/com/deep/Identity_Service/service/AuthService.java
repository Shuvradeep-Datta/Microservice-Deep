package com.deep.Identity_Service.service;

import com.deep.Identity_Service.entity.UserCredential;
import com.deep.Identity_Service.payload.TokenResponse;
import org.springframework.stereotype.Component;

@Component
public interface AuthService {
    //Register a new user
    UserCredential saveUser(UserCredential user);

    //Generate JWT token for a user
    public TokenResponse generateToken(String userName);


    //Validate the JWT token
    public void validateToken(String token);
}
