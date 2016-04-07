package com.xululabs.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class OcrEuerkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrEuerkaApplication.class, args);
	}
}
