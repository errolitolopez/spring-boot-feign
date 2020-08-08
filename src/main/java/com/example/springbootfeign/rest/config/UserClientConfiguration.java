package com.example.springbootfeign.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springbootfeign.rest.UserClient;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

@Configuration
public class UserClientConfiguration {

	@Bean
	public UserClient userClient() {

		return Feign.builder()
				.decoder(new JacksonDecoder())
				.encoder(new JacksonEncoder())
				.requestInterceptor(template -> {
					template.header("Accept", "application/json");
					template.header("Content-Type", "application/json");
				})
				.target(UserClient.class, "https://errolitolopez.github.io");
	}
}
