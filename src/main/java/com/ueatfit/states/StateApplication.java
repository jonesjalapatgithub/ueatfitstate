package com.ueatfit.states;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ueatfit.states"})
public class StateApplication  {

	/**
	 * 
	 * when run as a jar
	 */
	public static void main(String[] args) {
		SpringApplication.run(StateApplication.class, args);
	}
	
	/**
	 * 
	 * when you run as war
	 */
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		// TODO Auto-generated method stub
//		return builder.sources(StateApplication.class);
//	}
	
}
