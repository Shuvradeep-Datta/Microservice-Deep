package com.deep.microservice.UserMicroservice.repository;

import com.deep.microservice.UserMicroservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
