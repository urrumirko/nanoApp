package com.company.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

@Entity
@Table(name = "platform")
public class Platform implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int platformId;
	private String type;
	private String status;
	private Integer totalBudget;
	private Integer remainingBudget;
	private Long startDate;
	private Long endDate;

	@OneToOne(mappedBy = "platform")
	private TargetAudiance targetAudiance;
	@OneToOne(mappedBy = "platform")
	private Creative creative;
	@OneToOne(mappedBy = "platform")
	private Insight insight;

	public int getId() {
		return platformId;
	}

	public void setId(int platformId) {
		this.platformId = platformId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalBudget() {
		return totalBudget;
	}

	public void setTotalBudget(Integer totalBudget) {
		this.totalBudget = totalBudget;
	}

	public Integer getRemainingBudget() {
		return remainingBudget;
	}

	public void setRemainingBudget(Integer remainingBudget) {
		this.remainingBudget = remainingBudget;
	}

	public Long getStartDate() {
		return startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}

	public Long getEndDate() {
		return endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
	}

	public TargetAudiance getTargetAudiance() {
		return targetAudiance;
	}

	public void setTargetAudiance(TargetAudiance targetAudiance) {
		this.targetAudiance = targetAudiance;
	}

	public Creative getCreative() {
		return creative;
	}

	public void setCreative(Creative creative) {
		this.creative = creative;
	}

	public Insight getInsight() {
		return insight;
	}

	public void setInsight(Insight insight) {
		this.insight = insight;
	}

}
