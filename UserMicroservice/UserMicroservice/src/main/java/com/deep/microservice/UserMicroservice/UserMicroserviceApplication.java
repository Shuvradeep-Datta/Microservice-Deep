package com.deep.microservice.UserMicroservice;

import com.deep.microservice.UserMicroservice.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserMicroserviceApplication { //implements CommandLineRunner {

	@Autowired
//	private  RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(UserMicroserviceApplication.class, args);
	}

//	@Override
//	public void run(String... args) {
//		try{
//			Hotel forEntityBody = restTemplate.getForObject("http://localhost:8082/api/hotels/4d54d809efad4607bc2132c67ea53024", Hotel.class);
//
//			System.out.println(forEntityBody);
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//	}
}
