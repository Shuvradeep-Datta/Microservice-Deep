package com.deep.Identity_Service.controller;

import com.deep.Identity_Service.entity.UserCredential;
import com.deep.Identity_Service.exception.CustomTokenFailureException;
import com.deep.Identity_Service.exception.TokenNotValidException;
import com.deep.Identity_Service.payload.TokenRequest;
import com.deep.Identity_Service.payload.TokenResponse;
import com.deep.Identity_Service.payload.ValidateResponse;
import com.deep.Identity_Service.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping("/createUser")
    public ResponseEntity<UserCredential> createUser(@RequestBody UserCredential user) {
        UserCredential savedUser = authService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/token")
    public ResponseEntity<TokenResponse> generateToken(@RequestBody TokenRequest tokenRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(tokenRequest.getUserName(), tokenRequest.getPassword()));
        System.out.println(authenticate);
        TokenResponse tokenResponse = null;
        if (authenticate.isAuthenticated()) {
            tokenResponse = authService.generateToken(tokenRequest.getUserName());
        } else {
            throw new CustomTokenFailureException("Invalid user request");
        }

        return ResponseEntity.ok(tokenResponse);
    }

    @GetMapping("/validate")
    public ResponseEntity<ValidateResponse> validateToken(@RequestHeader("Authorization") String authHeader) {

        try {
            String token = authHeader.substring(7);
            authService.validateToken(token);
            ValidateResponse token_is_valid = ValidateResponse.builder()
                    .isValid(true)
                    .message("Token is valid")
                    .status(HttpStatus.OK)
                    .build();

            return ResponseEntity.ok(token_is_valid);
        } catch (TokenNotValidException e) {
            ValidateResponse token_is_invalid = ValidateResponse.builder()
                    .isValid(false)
                    .message("Token is invalid")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
            return ResponseEntity.ok(token_is_invalid);

        }
    }

//    @GetMapping("/validate")
//    public ResponseEntity<ValidateResponse> validateToken(@RequestParam String token) {
//
//        try {
//            authService.validateToken(token);
//            ValidateResponse token_is_valid = ValidateResponse.builder()
//                    .isValid(true)
//                    .message("Token is valid")
//                    .status(HttpStatus.OK)
//                    .build();
//
//            return ResponseEntity.ok(token_is_valid);
//        } catch (TokenNotValidException e) {
//            ValidateResponse token_is_invalid = ValidateResponse.builder()
//                    .isValid(false)
//                    .message("Token is invalid")
//                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .build();
//            return ResponseEntity.ok(token_is_invalid);
//
//        }
//    }
}
