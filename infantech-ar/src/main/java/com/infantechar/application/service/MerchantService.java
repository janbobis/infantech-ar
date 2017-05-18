package com.infantechar.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infantechar.application.model.Merchant;
import com.infantechar.application.repository.MerchantRepository;

@Service
public class MerchantService {

	@Autowired
	MerchantRepository repository;
	
	public void createMerchant(Merchant merchant){
		repository.save(merchant);
	}
	
	public Merchant getMerchant(long id){
		return repository.findById(id);
	}
	
	public List<Merchant> getMerchants(){
		return repository.findAll();
	}
	
}
