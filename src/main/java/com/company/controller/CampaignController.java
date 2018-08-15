package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.company.entity.Campaign;
import com.company.services.api.CampaignService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "Campaing Controller", description = "Campaign Controller to handle campaign items")
@RequestMapping("campaign")
public class CampaignController {

	@Autowired
	private CampaignService campaignService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get all the available Campaign resources", notes = "Gets a list of resource")
	@ResponseBody
	public Campaign getCampaignById(@PathVariable("id") long id) {
		Campaign campaign = campaignService.getCampaignById(id);
		return campaign;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ApiOperation(value = "Get all the available Campaign resources", notes = "Gets a list of resource")
	@ResponseBody
	public List<Campaign> getAllCampaigns() {
		List<Campaign> list = campaignService.getAllCampaigns();
		return list;
	}

}