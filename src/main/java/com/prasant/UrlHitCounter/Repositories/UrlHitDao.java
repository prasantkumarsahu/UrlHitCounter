package com.prasant.UrlHitCounter.Repositories;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class UrlHitDao {
	HashMap<String, Integer> data;
	int visitors;

	public UrlHitDao() {
		super();
		this.data = new HashMap<>();
	}

	public int getIncreaseVisitor() {
		data.put("unknown", data.getOrDefault("unknown", 0) + 1);
		return data.get("unknown");
	}

	public Integer getVisitorHitCounter(String username) {
		data.put(username, data.getOrDefault(username, 0) + 1);
		return data.get(username);
	}

}
