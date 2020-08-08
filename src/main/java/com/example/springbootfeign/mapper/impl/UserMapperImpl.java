package com.example.springbootfeign.mapper.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.springbootfeign.dao.entity.UserEntity;
import com.example.springbootfeign.dao.model.User;
import com.example.springbootfeign.mapper.UserMapper;
import com.example.springbootfeign.service.bo.UserResponse;

@Service
public class UserMapperImpl implements UserMapper {

	@Override
	public UserResponse mapToResponse(User user) {
		return new UserResponse(user.getEmail(),
				user.getLastName(),
				user.getFirstName(),
				user.getUsername(),
				user.getPassword());

	}

	@Override
	public List<UserResponse> mapToListResponse(List<User> users) {
		return users.stream()
				.map(this::mapToResponse)
				.collect(Collectors.toList());
	}

	@Override
	public User map(UserEntity user) {
		return new User(user.getEmail(),
				user.getLastName(),
				user.getFirstName(),
				user.getUsername(),
				user.getPassword());
	}

	@Override
	public List<User> map(List<UserEntity> users) {
		return users.stream()
				.map(this::map)
				.collect(Collectors.toList());
	}
}
