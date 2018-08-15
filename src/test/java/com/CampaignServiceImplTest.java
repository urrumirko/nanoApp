package com;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.entity.Campaign;
import com.company.services.CampaignServiceImpl;
import com.company.services.repository.CampaignRepository;

@RunWith(org.mockito.runners.MockitoJUnitRunner.class)
public class CampaignServiceImplTest {
	
	@Autowired
	private CampaignRepository campaignRepository;
	
	@Autowired
	private CampaignServiceImpl campaignServiceImpl;

}
