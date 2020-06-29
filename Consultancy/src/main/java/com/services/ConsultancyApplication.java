package com.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.client.RestTemplate;





@ComponentScan("com.services")
@SpringBootApplication
@EnableJpaRepositories
@EnableEurekaClient
public class ConsultancyApplication {
	
	
	
	/*
	 * @Bean public RestTemplate restTemplate() { RestTemplate template=new
	 * RestTemplate(); template.getMessageConverters().add(new
	 * StringHttpMessageConverter() ); template.getMessageConverters().add(new
	 * MappingJackson2CborHttpMessageConverter()); return template; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConsultancyApplication.class, args);
	}

}
