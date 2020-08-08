package com.example.springbootfeign.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

	private String email;
	private String lastName;
	private String firstName;
	private String username;
	private String password;
}
