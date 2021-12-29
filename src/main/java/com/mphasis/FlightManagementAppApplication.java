package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@SpringBootApplication
public class FlightManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementAppApplication.class, args);
	}

}
