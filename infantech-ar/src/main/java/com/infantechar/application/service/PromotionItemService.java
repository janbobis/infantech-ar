package com.infantechar.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infantechar.application.model.PromotionItem;
import com.infantechar.application.repository.PromotionItemRepository;

@Service
public class PromotionItemService {

	@Autowired
	PromotionItemRepository repository;
	
	public void createPromotionItem(PromotionItem promotionItem){
		repository.save(promotionItem);
	}
	
	public PromotionItem getPromotionItem(String promotionItemId){
		return repository.findByPromotionItemId(promotionItemId);
	}
	
	public List<PromotionItem> getPromotionItems(){
		return repository.findAll();
	}
	
}
