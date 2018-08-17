package com.learn.automation.service.init;

/**
 *
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  

@SpringBootApplication
public class App 
{
	static Logger log = LoggerFactory.getLogger(App.class); 
    public static void main( String[] appArgs )
    {
        //System.out.println( "API Automation Application Starting!" );
        log.info("API Automation Application Starting!");
        run(appArgs);
    }
    public static ConfigurableApplicationContext run(String[] appArgs) {
    	log.info("API Automation About To Start!");
		return SpringApplication.run(App.class, appArgs);
	}
}
