package com.springazur.SpringAzurDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzurDemoApplication {

	@GetMapping("/message")
	public String getMessage()
	{
		return "Congrats ! Spring boot Project uploaded on Microservices";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzurDemoApplication.class, args);
	}

}
