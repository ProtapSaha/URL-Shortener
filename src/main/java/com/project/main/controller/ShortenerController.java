package com.project.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShortenerController {

	@GetMapping("/")
	public String homepage() {
		return "Homepage.html";
	}
}
