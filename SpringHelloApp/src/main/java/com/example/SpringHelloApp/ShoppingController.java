package com.example.SpringHelloApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/demo")
public class ShoppingController {

	@GetMapping(path="/all")
	public @ResponseBody String getAllUsers() {
		// This returns a JSON or XML with the users
		System.out.println("inside all");
		return "This is successful test";
	}
}
