package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@GetMapping("/hel")
	public String show() {
		return "Hello!!";
	}
	
	
}
