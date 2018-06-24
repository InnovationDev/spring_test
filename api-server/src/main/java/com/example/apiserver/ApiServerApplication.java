package com.example.apiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ApiServerApplication extends SpringBootServletInitializer {
	
	  //Make sure that everything for .war deployment is there
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(ApiServerApplication.class);
	  }

	public static void main(String[] args) {
		SpringApplication.run(ApiServerApplication.class, args);
	}
}
