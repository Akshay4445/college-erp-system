package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	public User findByUsername(String username);
	//It help in registration avoid duplicate username
	//It help in login
}
