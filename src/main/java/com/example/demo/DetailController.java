package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {

	@RequestMapping("/")
	public String index() {
		return "Hello";
	}
}
