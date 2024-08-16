package com.prowings.attendencemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.prowings.attendencemanagement.entity")
public class AttendencemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendencemanagementApplication.class, args);
	}

}
