package com.deep.Identity_Service.repositories;

import com.deep.Identity_Service.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositories extends JpaRepository<UserCredential, Integer> {
    Optional<UserCredential> findByUserName(String userName);

}
