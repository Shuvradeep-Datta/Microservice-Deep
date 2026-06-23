package com.deep.microservice.HotelService.payload;


import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteResponse {
    private String message;
    private boolean success;
    private HttpStatus status;


}
