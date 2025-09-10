package com.ey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String home() {
		return "Welcome to Jenkins Home";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "Welcome to Jenkins Profile";
	}
}
