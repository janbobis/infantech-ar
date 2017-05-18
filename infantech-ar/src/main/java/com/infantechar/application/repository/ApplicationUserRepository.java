package com.infantechar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infantechar.application.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Integer>{
	public ApplicationUser findByUserId(String userId);
}
