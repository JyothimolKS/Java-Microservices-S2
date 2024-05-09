package com.learning.core.day1session1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer	
@SpringBootApplication
public class D01P03Application {

	public static void main(String[] args) {
		SpringApplication.run(D01P03Application.class, args);
	}

}
