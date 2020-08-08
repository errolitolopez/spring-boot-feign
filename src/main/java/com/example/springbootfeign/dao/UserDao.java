package com.example.springbootfeign.dao;

import java.util.List;

import com.example.springbootfeign.dao.model.User;

public interface UserDao {

	public List<User> getAllUsers();

}
