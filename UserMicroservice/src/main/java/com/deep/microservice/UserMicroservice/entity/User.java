package com.deep.microservice.UserMicroservice.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "micro_user")
public class User {
    @Id
    private String userId;
    @Column(name = "user_name", nullable = false, length = 30)
    private String name;
    @Column(name = "user_email", nullable = false, length = 50, unique = true)
    private String email;
    @Column(name = "user_about", length = 500)
    @Lob
    private String about;
    @Column(name = "user_dob", length = 20)
    private String dob;
    @Column(name = "user_address", length = 50)
    private String address;
    @Column(name = "user_phone_number", length = 15)
    private String phoneNumber;
    private transient List<Ratings> ratings;

}
