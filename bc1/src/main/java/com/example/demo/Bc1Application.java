package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Bc1Application {

	@GetMapping("/hello")
	public String test() {
		return "Hello World !";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(Bc1Application.class, args);
	}

}
