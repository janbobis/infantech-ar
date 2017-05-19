package com.infantechar.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infantechar.application.constants.ApplicationConstants;
import com.infantechar.application.model.Merchant;
import com.infantechar.application.model.Response;
import com.infantechar.application.repository.MerchantRepository;

@Service
public class MerchantService {

	@Autowired
	MerchantRepository repository;
	
	public Response createMerchant(Merchant merchant){
		Response response = new Response();
		if(repository.findByName(merchant.getName())!=null){
			response.setStatusCode(ApplicationConstants.STATUS_ERR);
			response.setStatusMessage(ApplicationConstants.MERCHANT_NAME_EXISTS);			
		} else {
			response.setStatusCode(ApplicationConstants.STATUS_OK);
			response.setStatusMessage(ApplicationConstants.SUCCESS);
			repository.saveAndFlush(merchant);	
		}		
		return response;
	}
	
	public Merchant getMerchant(long merchantId){
		return repository.findByMerchantId(merchantId);
	}
	
	public List<Merchant> getMerchants(){
		return repository.findAll();
	}
	
}
