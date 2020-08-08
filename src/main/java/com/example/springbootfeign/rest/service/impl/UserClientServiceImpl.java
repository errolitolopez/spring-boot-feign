package com.example.springbootfeign.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootfeign.dao.model.User;
import com.example.springbootfeign.rest.UserClient;
import com.example.springbootfeign.rest.mapper.UserClientMapper;
import com.example.springbootfeign.rest.service.UserClientService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class UserClientServiceImpl implements UserClientService {

	private final UserClient userClient;
	private final UserClientMapper userClientMapper;

	@Override
	public List<User> getAllUsers() {
		return userClientMapper.mapToList(userClient.getAllUsers());
	}
}
