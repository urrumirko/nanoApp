package com.company.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "insight")
public class Insight implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Integer impressions;
	private Integer clicks;
	private Integer websiteVisits;
	private Double nanosScore;
	private Double costPerClick;
	private Double clickThroughRate;
	private Double advancedKpi1;
	private Double advancedKpi3;

	@OneToOne
	private Platform platform;

	public Integer getImpressions() {
		return impressions;
	}

	public void setImpressions(Integer impressions) {
		this.impressions = impressions;
	}

	public Integer getClicks() {
		return clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public Integer getWebsiteVisits() {
		return websiteVisits;
	}

	public void setWebsiteVisits(Integer websiteVisits) {
		this.websiteVisits = websiteVisits;
	}

	public Double getNanosScore() {
		return nanosScore;
	}

	public void setNanosScore(Double nanosScore) {
		this.nanosScore = nanosScore;
	}

	public Double getCostPerClick() {
		return costPerClick;
	}

	public void setCostPerClick(Double costPerClick) {
		this.costPerClick = costPerClick;
	}

	public Double getClickThroughRate() {
		return clickThroughRate;
	}

	public void setClickThroughRate(Double clickThroughRate) {
		this.clickThroughRate = clickThroughRate;
	}

	public Double getAdvancedKpi1() {
		return advancedKpi1;
	}

	public void setAdvancedKpi1(Double advancedKpi1) {
		this.advancedKpi1 = advancedKpi1;
	}

	public Double getAdvancedKpi3() {
		return advancedKpi3;
	}

	public void setAdvancedKpi2(Double advancedKpi2) {
		this.advancedKpi3 = advancedKpi2;
	}

}
