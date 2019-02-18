package org.tom.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactUsController {

	@RequestMapping("contactus")
	public String contactus() 
	{
		return "contactUs";
	}
}
