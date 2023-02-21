package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtudentController {
	@GetMapping("/get")
	
	public Studentresponse Getstudent() {
		Studentresponse obj=new Studentresponse(25,"Achyuth","achu");
		return obj;
	}
}
