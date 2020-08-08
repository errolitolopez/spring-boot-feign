package com.example.springbootfeign.dao;

import java.util.List;

import com.example.springbootfeign.dao.entity.UserEntity;

public interface UserDao {

	public List<UserEntity> getAllUsers();

}
