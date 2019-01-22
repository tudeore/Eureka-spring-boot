package com.webserver.eurekacontroller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloResource {

	@Autowired
	private RestTemplate template;
	
	   @RequestMapping("/hello")
	   public ModelAndView home() {
		   System.out.println("hello");
		   String responseOne = template.getForObject("http://eurekaclient/hello", String.class);
		   System.out.println("hello after result" + responseOne);
		   return new ModelAndView("helloworld","message",responseOne);
	   }
}