package com.prasant.UrlHitCounter.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasant.UrlHitCounter.Models.UrlHit;
import com.prasant.UrlHitCounter.Services.UrlHitService;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

	@Autowired
	public UrlHitService urlHitService;

	@GetMapping("count")
	public String getHitCount() {
		return urlHitService.getIncreaseVisitor();
	}

	@GetMapping("username/{username}/count")
	public UrlHit getVisitorHitCount(@PathVariable String username) {
		return urlHitService.getVisiterHitCount(username);
	}
}
