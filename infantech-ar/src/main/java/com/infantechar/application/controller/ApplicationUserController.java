package com.infantechar.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infantechar.application.model.ApplicationUser;
import com.infantechar.application.service.ApplicationUserService;

@RestController
public class ApplicationUserController {
	@Autowired
	ApplicationUserService applicationUserService;
	
	@RequestMapping(value="/users", method=RequestMethod.GET, headers="Accept=application/json")
	public List<ApplicationUser> getApplicationUsers(){
		return applicationUserService.getApplicationUsers();
	}
	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.GET, headers="Accept=application/json")
	public ApplicationUser getApplicationUser(@PathVariable String userId){
		return applicationUserService.getApplicationUser(userId);
	}	
}
