package com.company.services.api;

import java.util.List;

import com.company.entity.Campaign;

public interface CampaignService {

	List<Campaign> getAllCampaigns();
	
    Campaign getCampaignById(long campaignId);
 
}
