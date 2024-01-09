package com.excalibur.hruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
public class HrUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

}
