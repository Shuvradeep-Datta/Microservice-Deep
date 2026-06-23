package com.deep.microservice.HotelService.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handleResourceNotFoundException(ResourceNotFoundException ex) {
//        String message = ex.getMessage();
//        ApiResponse apiResponse = ApiResponse.builder()
//                .message(message)
//                .status(true)
//                .httpStatus(HttpStatus.NOT_FOUND)
//                .build();

        Map<String,Object> apiMap = new HashMap<>();


        apiMap.put("message",ex.getMessage());
        apiMap.put("status",false);
        apiMap.put("Success Code",HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(apiMap, HttpStatus.NOT_FOUND);
    }
}
