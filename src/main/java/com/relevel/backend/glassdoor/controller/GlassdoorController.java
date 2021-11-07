package com.relevel.backend.glassdoor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlassdoorController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

