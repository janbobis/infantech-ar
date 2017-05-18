package com.infantechar.application.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infantechar.application.model.PromotionItem;

@Service
public class PromotionItemService {
	
	static List<PromotionItem> promotionItemList = new ArrayList<PromotionItem>();
	static{
		GregorianCalendar start = new GregorianCalendar(2017, Calendar.MAY, 1, 0, 0);
		GregorianCalendar end = new GregorianCalendar(2017, Calendar.MAY, 31, 0, 0);
		
		PromotionItem item1 = new PromotionItem();
		item1.setId(100000001);
		item1.setName("BPI P100.00 GC");
		item1.setDescription("BPI 100 Pesos Gift Cheque");
		item1.setPromotionType(1);
		item1.setMerchantId("BPI");
		item1.setReSpawn(true);
		item1.setValidateDateStart(Date.from(start.toInstant()));
		item1.setValidateDateEnd(Date.from(end.toInstant()));
		item1.setLatitude(14.85);
		item1.setLongitude(120.35);
		promotionItemList.add(item1);
		
		PromotionItem item2 = new PromotionItem();
		item2.setId(100000002);
		item2.setName("CITIBANK P1,000.00 GC");
		item2.setDescription("Citibank 1,000.00 Pesos Gift Cheque");
		item2.setPromotionType(1);
		item2.setMerchantId("CITI");
		item2.setReSpawn(true);
		item2.setValidateDateStart(Date.from(start.toInstant()));
		item2.setValidateDateEnd(Date.from(end.toInstant()));
		item2.setLatitude(14.851345);
		item2.setLongitude(121.4312312);
		promotionItemList.add(item2);
	}

	public List<PromotionItem> getPromotionItems(){
				
		
		return promotionItemList;
	}
	
	
	public PromotionItem getPromotionItem(long id){
		for(PromotionItem promotionItem : promotionItemList){
			if(promotionItem.getId()==id){
				return promotionItem;
			}
		}
		return null;
	}
	
}
