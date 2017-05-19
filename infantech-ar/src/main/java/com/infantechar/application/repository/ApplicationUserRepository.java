package com.infantechar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infantechar.application.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long>{
	
	public ApplicationUser findByUserId(long userId);
	
	public ApplicationUser findByUserName(String userName);
	
}
