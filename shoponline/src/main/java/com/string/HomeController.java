package com.string;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String showHomePage() {
		return "home";
	}
	
	@RequestMapping("/")
	public String showIndexPage() {
		return "index";
	}
}
