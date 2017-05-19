package com.infantechar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infantechar.application.model.PromotionItem;

public interface PromotionItemRepository extends JpaRepository<PromotionItem, Integer>{
	
	public PromotionItem findByPromotionItemId(long promotionItemId);
	public PromotionItem findByName(String name);
	
}
