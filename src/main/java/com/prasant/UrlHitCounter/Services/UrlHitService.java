package com.prasant.UrlHitCounter.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasant.UrlHitCounter.Models.UrlHit;
import com.prasant.UrlHitCounter.Repositories.UrlHitDao;

@Service
public class UrlHitService {

	@Autowired
	UrlHitDao urlHitDao;

	public String getIncreaseVisitor() {
		return "visitors : " + urlHitDao.getIncreaseVisitor();
	}

	public UrlHit getVisiterHitCount(String username) {
		return new UrlHit(username, urlHitDao.getVisitorHitCounter(username));
	}

}
