package com.company.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.company.entity.Platform;
import com.company.services.api.PlatformService;

@Controller
@RequestMapping("platform")
public class PlatformController {
	
	@Autowired
	private PlatformService platformService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Platform> getPlatformById(@PathVariable("id") Integer id) {
		Platform Platform = platformService.getPlatformById(id);
		return new ResponseEntity<Platform>(Platform, HttpStatus.OK);
	}
	
	 @RequestMapping(method = RequestMethod.GET)
	 @ResponseBody
	 public List<Platform> getAllPlatforms() {
		List<Platform> list = platformService.getAllPlatforms();
		return list;
	 }

} 