package com.company.dto;

import com.company.entity.Platform;

public class CampaignDto {
	
	private String id;
	private String name;
	private String goal;
	private int totalBudget;
	private String status;
	private Platform platform;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public int getTotalBudget() {
		return totalBudget;
	}
	public void setTotalBudget(int totalBudget) {
		this.totalBudget = totalBudget;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Platform getPlatform() {
		return platform;
	}
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
	
	
	
}
