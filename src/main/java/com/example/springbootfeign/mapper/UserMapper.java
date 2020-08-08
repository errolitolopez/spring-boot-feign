package com.example.springbootfeign.mapper;

import java.util.List;

import com.example.springbootfeign.dao.entity.UserEntity;
import com.example.springbootfeign.dao.model.User;
import com.example.springbootfeign.service.bo.UserResponse;

public interface UserMapper {

	public UserResponse mapToResponse(User user);

	public List<UserResponse> mapToListResponse(List<User> users);

	public User map(UserEntity user);

	public List<User> map(List<UserEntity> users);
}
