package com.client.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/hello")
public class helloController {

	@GetMapping
	public String getHello() {
		System.out.println("hello from hello service");
		return "hello world";
	}

}
