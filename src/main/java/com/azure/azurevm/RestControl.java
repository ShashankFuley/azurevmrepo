package com.azure.azurevm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {
	
	@GetMapping("/world")
	public String returnHello() {
		return "Hello World";
	}
}
