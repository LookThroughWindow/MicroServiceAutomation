package com.learn.automation.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.automation.service.domain.Greeting;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  

@RestController
@RequestMapping("/greeting")
public class GreetingService {
	
	private static Logger log = LoggerFactory.getLogger(GreetingService.class); 
	private static final String TEMPLATE = "Hello %s!";
	private final AtomicInteger counter = new AtomicInteger();
	    
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		log.info(name);
		return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
	}
	
	
}
