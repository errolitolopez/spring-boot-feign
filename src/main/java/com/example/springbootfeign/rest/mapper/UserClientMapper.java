package com.example.springbootfeign.rest.mapper;

import java.util.List;

import com.example.springbootfeign.dao.model.User;
import com.example.springbootfeign.rest.service.bo.UserClientResponse;

public interface UserClientMapper {

	User map(UserClientResponse userClientResponse);

	List<User> mapToList(List<UserClientResponse> userClientResponseList);
}
