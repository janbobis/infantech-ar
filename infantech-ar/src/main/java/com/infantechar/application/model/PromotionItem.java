package com.infantechar.application.model;

import java.util.Date;

public class PromotionItem {
	private long id;
	private String name;	
	private String description;
	private int promotionType;
	private String merchantId;	
	private Date validateDateStart;
	private Date validateDateEnd;
	private boolean reSpawn;
	private double latitude;
	private double longitude;
	private String userId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPromotionType() {
		return promotionType;
	}
	public void setPromotionType(int promotionType) {
		this.promotionType = promotionType;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public Date getValidateDateStart() {
		return validateDateStart;
	}
	public void setValidateDateStart(Date validateDateStart) {
		this.validateDateStart = validateDateStart;
	}
	public Date getValidateDateEnd() {
		return validateDateEnd;
	}
	public void setValidateDateEnd(Date validateDateEnd) {
		this.validateDateEnd = validateDateEnd;
	}
	public boolean isReSpawn() {
		return reSpawn;
	}
	public void setReSpawn(boolean reSpawn) {
		this.reSpawn = reSpawn;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}	
}
