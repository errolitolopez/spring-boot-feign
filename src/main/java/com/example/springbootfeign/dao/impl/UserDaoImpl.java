package com.example.springbootfeign.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootfeign.dao.UserDao;
import com.example.springbootfeign.dao.model.User;
import com.example.springbootfeign.dao.repository.UserRepository;
import com.example.springbootfeign.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class UserDaoImpl implements UserDao {

	private final UserRepository userRepository;
	private final UserMapper userMapper;

	@Override
	public List<User> getAllUsers() {
		return userMapper.map(userRepository.findAll());
	}
}
