package com.mohit.MySqlSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MySqlSbApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MySqlSbApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MySqlSbApplication.class);
	}
}
