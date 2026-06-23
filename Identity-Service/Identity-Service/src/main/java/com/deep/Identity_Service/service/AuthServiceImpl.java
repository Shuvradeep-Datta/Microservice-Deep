package com.deep.Identity_Service.service;

import com.deep.Identity_Service.entity.UserCredential;
import com.deep.Identity_Service.payload.TokenResponse;
import com.deep.Identity_Service.repositories.UserRepositories;
import com.deep.Identity_Service.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private UserRepositories repositories;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private JwtUtil util;

    @Override
    public UserCredential saveUser(UserCredential user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repositories.save(user);

    }

    @Override
    public TokenResponse generateToken(String userName) {
        String token = util.generateToken(userName);

        TokenResponse t = TokenResponse.builder()
                .token(token)
                .status(HttpStatus.OK)
                .build();

        return t;


    }

    @Override
    public void validateToken(String token) {

            util.validateToken(token);


    }
}
