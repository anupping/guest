package org.tom.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HomeController {

	@RequestMapping("home")
	public String home() 
	{
		return "home";
	}
}
