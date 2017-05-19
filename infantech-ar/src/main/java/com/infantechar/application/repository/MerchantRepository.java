package com.infantechar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infantechar.application.model.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Integer>{
	
	public Merchant findByMerchantId(long merchantId);
	
	public Merchant findByName(String name);
	
}
