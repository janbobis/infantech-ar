package com.infantechar.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infantechar.application.model.ApplicationUser;
import com.infantechar.application.repository.ApplicationUserRepository;

@Service
public class ApplicationUserService {

	@Autowired
	ApplicationUserRepository repository;
	
	public void createApplicationUser(ApplicationUser applicationUser){
		repository.save(applicationUser);
	}
	
	public ApplicationUser getApplicationUser(String userId){
		return repository.findByUserId(userId);
	}
	
	public List<ApplicationUser> getApplicationUsers(){
		return repository.findAll();
	}
	
}
