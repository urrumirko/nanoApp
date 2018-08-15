package com.company.services;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dto.CampaignDto;
import com.company.entity.Campaign;
import com.company.entity.Platform;
import com.company.services.api.CampaignService;
import com.company.services.repository.CampaignRepository;

@Service
public class CampaignServiceImpl implements CampaignService {
	
	@Autowired
	private CampaignRepository campaignRepository;

	@Override
	public Campaign getCampaignById(long campaignId) {
		Campaign obj = campaignRepository.getByCampaignId(campaignId);
		return obj;
	}

	@Override
	public List<Campaign> getAllCampaigns() {
		List<Campaign> list = new ArrayList<>();
		campaignRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	
}
