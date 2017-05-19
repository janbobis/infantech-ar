package com.infantechar.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infantechar.application.constants.ApplicationConstants;
import com.infantechar.application.model.PromotionItem;
import com.infantechar.application.model.Response;
import com.infantechar.application.repository.PromotionItemRepository;

@Service
public class PromotionItemService {

	@Autowired
	PromotionItemRepository repository;
	
	public Response createPromotionItem(PromotionItem promotionItem){
		Response response = new Response();
		response.setStatusCode(ApplicationConstants.STATUS_OK);
		response.setStatusMessage(ApplicationConstants.SUCCESS);
		repository.saveAndFlush(promotionItem);	
		return response;
	}
	
	public PromotionItem getPromotionItem(long promotionItemId){
		return repository.findByPromotionItemId(promotionItemId);
	}
	
	public List<PromotionItem> getPromotionItems(){
		return repository.findAll();
	}
	
}
