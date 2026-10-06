package com.flipkard.flipeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlipeserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipeserverApplication.class, args);
	}

}


