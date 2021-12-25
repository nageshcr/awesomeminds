package com.example.Rest;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final AtomicInteger count = new AtomicInteger(0);

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam("name") String name) {

		return new Greeting(count.incrementAndGet(), String.format("Hello, %s!", name));

	}
	


}
