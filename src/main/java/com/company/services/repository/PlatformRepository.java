package com.company.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Campaign;
import com.company.entity.Platform;

@Repository
public interface PlatformRepository extends JpaRepository<Platform, String>, JpaSpecificationExecutor<Platform> {
	
	Platform getByPlatformId(long platformId);
}
