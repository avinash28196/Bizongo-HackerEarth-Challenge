package com.bizongo.store.bizongo.frontend.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BizongoFrontendChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizongoFrontendChallengeApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	      return new WebMvcConfigurerAdapter() {
	         @Override
	         public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/globalGameSaleses").allowedOrigins("http://localhost:3000");
	         }
	    };
	}

}
