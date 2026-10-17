package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.UserDto;
import com.entity.User;
import com.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/auth")

public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/register")
	public String register(@RequestBody User u)
	{
		return service.registration(u);
	}

	@PostMapping("/login")
	public ResponseEntity<?>login(@RequestBody UserDto dto){
		User existinguser= service.login(dto);
		if(existinguser!=null) {
			return ResponseEntity.ok(existinguser);
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
		}

	
	}
	
}
	

