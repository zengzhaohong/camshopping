package com.speeder.camshopping.entity;

import java.util.Date;

public class Shop {
	private Long shopId;
	//private Long ownerId;
	private String shopName;
	//��������
	private String shopDesc;
	//���̵�ַ
	private String shopAddr;

	private String phone;
	private String shopImg;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	//-1�����ã�0.����У�1.����
	private Integer enableStatus;
	//��������Ա����ҵ�����
	private String advice;
	
	private Integer areaId;
	private Long shopCategoryId;

	
	private Area area;
	private PersonInfo owner;
	private ShopCategory shopCategory;
	private ShopCategory parentCategory;
	
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Long getShopCategoryId() {
		return shopCategoryId;
	}
	public void setShopCategoryId(Long shopCategoryId) {
		this.shopCategoryId = shopCategoryId;
	}
	public ShopCategory getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(ShopCategory parentCategory) {
		this.parentCategory = parentCategory;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopDesc() {
		return shopDesc;
	}
	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}
	public String getShopAddr() {
		return shopAddr;
	}
	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public PersonInfo getOwner() {
		return owner;
	}
	public void setOwner(PersonInfo owner) {
		this.owner = owner;
	}
	
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public ShopCategory getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(ShopCategory shopCategory) {
		this.shopCategory = shopCategory;
	}
	
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + "]";
	}
	
}
