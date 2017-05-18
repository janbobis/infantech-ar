package com.infantechar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infantechar.application.model.Merchant;
import com.infantechar.application.model.PromotionItem;

public interface PromotionItemRepository extends JpaRepository<PromotionItem, Integer>{
	public PromotionItem findByPromotionItemId(String promotionItemId);
}
