package com.example.sharedocument;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/api/hello")
	public String greet() {
		return "Hello from the other side!!!";
	}
}
