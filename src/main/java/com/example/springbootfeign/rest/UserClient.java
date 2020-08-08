package com.example.springbootfeign.rest;

import java.util.List;

import com.example.springbootfeign.rest.service.bo.UserClientResponse;

import feign.RequestLine;

public interface UserClient {

	@RequestLine("GET /json-api-user/users/users.json")
	List<UserClientResponse> getAllUsers();
}
