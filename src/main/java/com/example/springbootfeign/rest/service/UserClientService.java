package com.example.springbootfeign.rest.service;

import java.util.List;

import com.example.springbootfeign.dao.model.User;

public interface UserClientService {

	public List<User> getAllUsers();
}
