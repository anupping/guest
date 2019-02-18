package org.tom.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class AboutController {

	@RequestMapping("about")
	public String about() 
	{
		return "about";
	}

}
