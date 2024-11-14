package com.ecom.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecom.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
	 Optional<User> findByEmail(String email);
	 
	 @Query("SELECT COUNT(email) FROM User WHERE email=:email" )
	 Integer getUserEmailCount(String email);
}
