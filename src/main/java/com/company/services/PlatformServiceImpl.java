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

import com.company.entity.Platform;
import com.company.entity.Platform;
import com.company.services.api.PlatformService;
import com.company.services.api.PlatformService;
import com.company.services.repository.PlatformRepository;

@Service
public class PlatformServiceImpl implements PlatformService {
	
	@Autowired
	private PlatformRepository platformRepository;

	@Override
	public Platform getPlatformById(long platformId) {
		Platform obj = platformRepository.getByPlatformId(platformId);
		return obj;
	}

	@Override
	public List<Platform> getAllPlatforms() {
		List<Platform> list = new ArrayList<>();
		platformRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	
}
