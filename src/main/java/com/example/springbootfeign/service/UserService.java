package com.example.springbootfeign.service;

import java.util.List;

import com.example.springbootfeign.service.bo.ServiceResponse;
import com.example.springbootfeign.service.bo.UserResponse;

public interface UserService {

	public ServiceResponse<List<UserResponse>> getAllUsers();

	public ServiceResponse<List<UserResponse>> getAllUsersFromUserClient();
}
