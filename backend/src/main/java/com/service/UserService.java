package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.DTO.UserDto;
import com.entity.User;
import com.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository usresp;
	public String registration(User u) 
	{
		User existinguser=usresp.findByUsername(u.getUsername());
		if(existinguser==null)
		{
			usresp.save(u);
			return "User registration sucessful";
		}
		else
		{
			return "User name already exists..please try another username";
			
		}
	}
	
	

public User login(UserDto dto) {
	User existinguser=usresp.findByUsername(dto.getUsername());
	if(existinguser==null) {
		return null;
	}else {
		if(existinguser.getPassword().equals(dto.getPassword())) {
			return existinguser;
		}else {
			return null;
		}
	}
}

}
