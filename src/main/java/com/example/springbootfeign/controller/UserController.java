package com.example.springbootfeign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootfeign.service.UserService;
import com.example.springbootfeign.service.bo.ServiceResponse;
import com.example.springbootfeign.service.bo.UserResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class UserController {

	private final UserService userService;

	@GetMapping
	public ServiceResponse<List<UserResponse>> getAllUsers() {

		return userService.getAllUsers();
	}

	@GetMapping("/v2")
	public ServiceResponse<List<UserResponse>> getAllUsersFromUserClient() {

		return userService.getAllUsersFromUserClient();
	}
}
