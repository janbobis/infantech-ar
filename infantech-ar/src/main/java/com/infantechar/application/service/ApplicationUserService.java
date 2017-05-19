package com.infantechar.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infantechar.application.constants.ApplicationConstants;
import com.infantechar.application.model.ApplicationUser;
import com.infantechar.application.model.Response;
import com.infantechar.application.repository.ApplicationUserRepository;

@Service
public class ApplicationUserService {

	@Autowired
	ApplicationUserRepository repository;
	
	public Response saveUser(ApplicationUser applicationUser){
		Response response = new Response();
		if(repository.findByUserName(applicationUser.getUserName())!=null){
			response.setStatusCode(ApplicationConstants.STATUS_ERR);
			response.setStatusMessage(ApplicationConstants.USERNAME_EXIST);			
		} else {
			response.setStatusCode(ApplicationConstants.STATUS_OK);
			response.setStatusMessage(ApplicationConstants.SUCCESS);
			repository.saveAndFlush(applicationUser);	
		}
		
		return response;
	}
	
	public ApplicationUser getApplicationUser(long userId){
		return repository.findByUserId(userId);
	}
	
	public List<ApplicationUser> getApplicationUsers(){
		return repository.findAll();
	}
	
}
