package com.infantechar.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infantechar.application.model.Merchant;
import com.infantechar.application.service.MerchantService;

@RestController
public class MerchantController {

	@Autowired
	MerchantService merchantService;
	
	@RequestMapping(value="/merchants", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Merchant> getMerchants(){
		return merchantService.getMerchants();
	}
	
	@RequestMapping(value="/merchant/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public Merchant getMerchant(@PathVariable long id){
		return merchantService.getMerchant(id);
	}	
	
}
