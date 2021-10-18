package com.cg.m3.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestApplication {
	
	@GetMapping("/msg")
	public String Message() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
