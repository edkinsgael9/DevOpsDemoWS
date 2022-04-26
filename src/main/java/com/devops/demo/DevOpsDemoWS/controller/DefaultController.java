package com.devops.demo.DevOpsDemoWS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	
	@GetMapping("/test-hello")
	public String test() {
		return "Hello World !!!";
	}
	
	@GetMapping("/hello-author")
	public String helloAuthor() {
		return "Hello Edkins Gael KOUNA ETEME !!!";
	}
	
	@GetMapping("/hello-elo")
	public String helloElo() {
		return "Hello ELOUNDOU Celestin Placide !!!";
	}
	
	@GetMapping("/hello-everyone")
	public String helloEveryone() {
		return "Hello Everyone !!!";
	}
	
	@GetMapping("/hello-eric")
	public String helloEric() {
		return "Hello Eric CHOUPO KAYO !!!";
	}
}

