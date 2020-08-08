package com.example.springbootfeign.dao.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {

	private final String email;
	private final String lastName;
	private final String firstName;
	private final String username;
	private final String password;
}
