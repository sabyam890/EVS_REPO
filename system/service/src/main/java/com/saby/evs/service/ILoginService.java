package com.saby.evs.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.saby.evs.exception.ServiceException;
import com.saby.evs.request.UserRequest;
import com.saby.evs.response.UserResponse;

public interface ILoginService {

	public UserResponse loginUser(
			@RequestBody UserRequest userRequest) throws ServiceException;
}
