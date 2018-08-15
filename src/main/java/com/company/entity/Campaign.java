package com.company.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name = "campaign")
public class Campaign implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long campaignId;
	private String name;
	private String goal;
	private int totalBudget;
	private String status;
	@OneToMany
	@JoinTable(joinColumns = @JoinColumn(name = "CAMPAIGN_ID"), inverseJoinColumns = @JoinColumn(name = "PLATFORM_ID"))
	private List<Platform> platform = new ArrayList<Platform>();
	
	public long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(long campaignId) {
		this.campaignId = campaignId;
	}

	public void setTotalBudget(int totalBudget) {
		this.totalBudget = totalBudget;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Platform> getPlatforms() {
		return platform;
	}

	public void setPlatforms(List<Platform> platforms) {
		this.platform = platforms;
	}

}
