package com.posidex.lic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LicMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LicMicroservicesApplication.class, args);
	}
	  @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	  @Bean
	    public ReloadableResourceBundleMessageSource messageSource() {
	        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	        messageSource.setBasename("classpath:msg/messages");
	        messageSource.setCacheSeconds(3600); //refresh cache once per hour
	        return messageSource;
	  }
}
