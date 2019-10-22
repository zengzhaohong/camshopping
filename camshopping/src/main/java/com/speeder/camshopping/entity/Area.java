package com.speeder.camshopping.entity;

import java.util.Date;

public class Area {
	//ID
	private Integer areaId;
	//区域名称
	private String areaName;
	//权重
	private Integer priority;
	//创建时间
	private Date createDate;
	//更新时间
	private Date lastEditDate;
	
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastEditDate() {
		return lastEditDate;
	}
	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}
	
	
	
}
