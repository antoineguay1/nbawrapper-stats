package com.drmilk.nbawrapper.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Configuration class of the application.
 * 
 * @author Antoine Guay
 */
@Configuration
@ComponentScan("com.drmilk.nbawrapper")
public class AppConfig {

	@Bean
	public String currentSeason() {
		Calendar now = Calendar.getInstance();
		Integer year = now.get(Calendar.YEAR);
		Integer month = now.get(Calendar.MONTH);
		if (month >= Calendar.SEPTEMBER) {
			return year.toString();
		} else {
			year--;
			return year.toString();
		}
	}

	@Bean
	public String sourceBaseUrl() {
		return "http://data.nba.net/data/10s/prod/v1";
	}
	
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
