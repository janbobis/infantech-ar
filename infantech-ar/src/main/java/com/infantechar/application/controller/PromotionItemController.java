package com.infantechar.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infantechar.application.model.PromotionItem;
import com.infantechar.application.model.Response;
import com.infantechar.application.service.PromotionItemService;

@RestController
public class PromotionItemController {

	@Autowired
	PromotionItemService promotionItemService;
	
	@RequestMapping(value="/promoItems", method=RequestMethod.GET, headers="Accept=application/json")
	public List<PromotionItem> getPromotionItems(){
		return promotionItemService.getPromotionItems();
	}
	
	@RequestMapping(value="/promoItem/{promotionItemId}", method=RequestMethod.GET, headers="Accept=application/json")
	public PromotionItem getPromotionItem(@PathVariable long promotionItemId){
		return promotionItemService.getPromotionItem(promotionItemId);
	}
	
	@RequestMapping(value="/promoItem", method=RequestMethod.POST, headers="Accept=application/json")
	public Response createPromotionItem(@RequestBody PromotionItem promotionItem){
		return promotionItemService.createPromotionItem(promotionItem);
	}
}
