package com.example.springbootfeign.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.springbootfeign.dao.UserDao;
import com.example.springbootfeign.mapper.UserMapper;
import com.example.springbootfeign.rest.service.UserClientService;
import com.example.springbootfeign.service.UserService;
import com.example.springbootfeign.service.bo.ServiceResponse;
import com.example.springbootfeign.service.bo.UserResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class UserServiceImpl implements UserService {

	private final UserDao userDao;
	private final UserClientService userClientService;
	private final UserMapper userMapper;

	@Override
	public ServiceResponse<List<UserResponse>> getAllUsers() {

		List<UserResponse> users = userMapper.mapToListResponse(userDao.getAllUsers());

		return new ServiceResponse<>(users, HttpStatus.OK, "Success");
	}

	@Override
	public ServiceResponse<List<UserResponse>> getAllUsersFromUserClient() {

		List<UserResponse> users = userMapper.mapToListResponse(userClientService.getAllUsers());

		return new ServiceResponse<>(users, HttpStatus.OK, "Success");
	}
}
