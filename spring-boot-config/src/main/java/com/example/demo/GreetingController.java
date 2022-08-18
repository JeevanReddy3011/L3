package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Autowired
	private Dbsettings dbSettings;
	
	@Value("${app.description}")
	private String greetingMessage;
	
	@GetMapping("/greeting")
	public String greeting() {
		return (dbSettings.getConnection() + dbSettings.getHost());
	}

}
