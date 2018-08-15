package com.company.services.api;

import java.util.List;

import com.company.entity.Platform;

public interface PlatformService {

	List<Platform> getAllPlatforms();
	
    Platform getPlatformById(long platformId);
 
}
