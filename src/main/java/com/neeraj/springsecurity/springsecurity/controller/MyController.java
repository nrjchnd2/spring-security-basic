package com.neeraj.springsecurity.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/security/rest")
	public String sayHello() {
		return "Hello World !";
	}

}
