package com.halilben22.detailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
public class DetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailsServiceApplication.class, args);
	}

}
