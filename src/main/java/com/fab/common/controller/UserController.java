package com.fab.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@GetMapping("/getInfo")
	public String getInfo() {

		System.out.println("Controller class ");
		return "FAB example";
	}
	
}
