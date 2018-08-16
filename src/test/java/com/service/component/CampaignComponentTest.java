package com.service.component;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.company.Application;
import com.company.entity.Campaign;
import com.company.entity.Platform;
import com.company.services.api.CampaignService;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"http://localhost:8080"} , classes = { Application.class })
public class CampaignComponentTest {
	
	@Autowired
	private CampaignService service;
	
	@Test
	public void getCampaigns_when_campaignsExists_then_returnCampaignsList() {
		//Act
		List<Campaign> campaigns = service.getAllCampaigns();
		
		//Assert
		assertNotNull(campaigns);
		assertEquals(campaigns.size(), 2);
	}
	
	@Test
	public void getCampaigns_when_campaignsWithPlatformsExist_then_returnPlatforms() {
		//Act
		List<Campaign> campaigns = service.getAllCampaigns();
		
		//Assert
		assertNotNull(campaigns);
		assertEquals(campaigns.size(), 2);
		assertEquals(campaigns.get(0).getPlatforms().size(), 3);
		
		List<Platform> platforms = campaigns.get(0).getPlatforms();
		platforms.stream().forEach(platform -> {
			assertNotNull(platform.getType());
			assertNotNull(platform.getCreative());
			assertNotNull(platform.getEndDate());
			assertNotNull(platform.getInsight());
		});
	}
	
	@Test
	public void getCampaignById_when_campaignsWithThatIdExist_then_returnCampaign() {
		//Act
		Campaign campaign = service.getCampaignById(1L);
		
		//Assert
		assertNotNull(campaign);
		assertEquals(campaign.getPlatforms().size(), 3);
		
		List<Platform> platforms = campaign.getPlatforms();
		platforms.stream().forEach(platform -> {
			assertNotNull(platform.getType());
			assertNotNull(platform.getCreative());
			assertNotNull(platform.getEndDate());
			assertNotNull(platform.getInsight());
		});	
	}
	@Test
	public void getCampaignById_when_campaignsWithIdDoesNotExist_then_returnEmptyList() {
		//Act
		Campaign campaign = service.getCampaignById(4L);
		
		//Assert
		assertNull(campaign);
	}

}
