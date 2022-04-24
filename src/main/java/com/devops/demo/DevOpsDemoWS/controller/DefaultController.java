package com.devops.demo.DevOpsDemoWS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	
	@GetMapping("/test-hello")
	public String test() {
		return "Hello World !!!";
	}
	
	@GetMapping("hello-author")
	public String helloAuthor() {
		return "Hellow Edkins Gael KOUNA ETEME !!!";
	}
}

