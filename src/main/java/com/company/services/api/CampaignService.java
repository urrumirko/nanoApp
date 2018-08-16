package com.company.services.api;

import java.util.List;

import com.company.entity.Campaign;

/**
 * 
 * @author mirkourru
 *
 */
public interface CampaignService {

	List<Campaign> getAllCampaigns();
	
    Campaign getCampaignById(long campaignId);
 
}
