package com.example.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam("name") String name, Model model) {
		System.out.println("Inside Method");
		model.addAttribute("name", name);
		return "greeting";

	}
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("Index");
		return "index";
	}


}
