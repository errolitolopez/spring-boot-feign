package com.example.springbootfeign.rest.mapper.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.springbootfeign.dao.model.User;
import com.example.springbootfeign.rest.mapper.UserClientMapper;
import com.example.springbootfeign.rest.service.bo.UserClientResponse;

@Service
public class UserClientMapperImpl implements UserClientMapper {

	@Override
	public User map(UserClientResponse userClientResponse) {

		return new User(userClientResponse.getEmail(),
								userClientResponse.getLastName(),
								userClientResponse.getFirstName(),
								userClientResponse.getUsername(),
								userClientResponse.getPassword());

	}

	@Override
	public List<User> mapToList(List<UserClientResponse> userClientResponseList) {
		return userClientResponseList.stream()
				.map(this::map)
				.collect(Collectors.toList());
	}
}
