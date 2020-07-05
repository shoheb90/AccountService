package com.shb.appl.api.acctmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApplApiAccManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplApiAccManagementApplication.class, args);
	}

}
