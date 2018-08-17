package com.learn.automation.service.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Greeting {
	
	private static Logger log = LoggerFactory.getLogger(Greeting.class); 
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        log.info("Set ID: " + id + " , and Content: " + content);
    }

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
}
