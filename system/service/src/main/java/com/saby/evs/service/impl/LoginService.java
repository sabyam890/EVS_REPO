package com.saby.evs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saby.evs.dto.UserDto;
import com.saby.evs.exception.ServiceException;
import com.saby.evs.repository.IUserDao;
import com.saby.evs.request.UserRequest;
import com.saby.evs.response.UserResponse;
import com.saby.evs.service.ILoginService;


/**
 * @author Sabyasachi
 *
 */
@Service
public class LoginService implements ILoginService {
	
	@Autowired
	IUserDao userDao;

	@Override
	public UserResponse loginUser(UserRequest userRequest) throws ServiceException {
		UserDto dto = null;
		if(userRequest != null){
			dto = userRequest.getUserDto();
			if(dto!=null){
				final String userName = dto.getUserName();
				final String password = dto.getPassword();
				
			}
		}
		return null;
	}

}
