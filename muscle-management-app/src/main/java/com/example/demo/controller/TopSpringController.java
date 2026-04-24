package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopSpringController {
	
	@GetMapping("/top")
	public String top() {
		return "top-muscle";
	}
}
