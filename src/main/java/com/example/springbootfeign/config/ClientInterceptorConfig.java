package com.example.springbootfeign.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.springbootfeign.interceptor.ClientInterceptor;

@Configuration
public class ClientInterceptorConfig implements WebMvcConfigurer {

	@Autowired
	ClientInterceptor clientInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(clientInterceptor);
	}
}
