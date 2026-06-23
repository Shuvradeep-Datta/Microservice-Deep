package com.deep.Identity_Service.config;

import com.deep.Identity_Service.entity.UserCredential;
import com.deep.Identity_Service.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepositories repositories;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserCredential credential = repositories.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
        return new CustomUserDetails(credential);
    }
}
