package com.infantechar.application.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="promotionitem")
public class PromotionItem {
	
	@Id	
	@Column(name="promotionitemid")
	private String promotionItemId;
	
	@Column(name="name")
	private String name;	
	
	@Column(name="description")
	private String description;
	
	@Column(name="promotiontype")
	private int promotionType;
	
	@Column(name="merchantid")
	private String merchantId;	
	
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name="validitydatestart")
	private Date validityDateStart;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name="validitydateend")
	private Date validityDateEnd;
	
	@Column(name="respawn")
	private int reSpawn;
	
	@Column(name="latitude")
	private double latitude;
	
	@Column(name="longitude")
	private double longitude;
	
	@Column(name="userid")
	private String userId;
	
	
	public String getPromotionItemId() {
		return promotionItemId;
	}
	public void setPromotionItemId(String promotionItemId) {
		this.promotionItemId = promotionItemId;
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
	public Date getValidityDateStart() {
		return validityDateStart;
	}
	public void setValidityDateStart(Date validityDateStart) {
		this.validityDateStart = validityDateStart;
	}
	public Date getValidityDateEnd() {
		return validityDateEnd;
	}
	public void setValidityDateEnd(Date validityDateEnd) {
		this.validityDateEnd = validityDateEnd;
	}
	public int getReSpawn() {
		return reSpawn;
	}
	public void setReSpawn(int reSpawn) {
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
