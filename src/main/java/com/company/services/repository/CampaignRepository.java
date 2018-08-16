package com.company.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.company.entity.Campaign;
/**
 * Campaign JPA Repository
 * 
 * @author mirkourru
 *
 */
@Repository
public interface CampaignRepository extends JpaRepository<Campaign, String>, JpaSpecificationExecutor<Campaign> {
	
	Campaign getByCampaignId(long campaignId);
}
