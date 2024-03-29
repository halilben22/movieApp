package com.halilben22.replyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReplyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReplyServiceApplication.class, args);
	}

}
