package com.example.springbootfeign.dao.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbootfeign.dao.entity.UserEntity;

// Fake Repository
@Service
public class UserRepository {

	public List<UserEntity> findAll() {

		return Arrays.asList(
				new UserEntity(
						"errolito@mail.com", "Lopez", "Errolito", "rols09", "password"),
				new UserEntity(
						"jamesbond@mail.com", "Bond", "James", "jamesb123", "12345"),
				new UserEntity(
						"annasmith@mail.com", "Smith", "Anna", "annas123", "12345")
		);
	}

}
