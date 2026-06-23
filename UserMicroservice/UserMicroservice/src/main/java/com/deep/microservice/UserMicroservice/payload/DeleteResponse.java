package com.deep.microservice.UserMicroservice.payload;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteResponse {
    private String message;
    private boolean success;
    private int status;


}
