package com.introToSpringContext.business;

import org.springframework.stereotype.Component;

@Component
public class MongoDBService implements DataService {
	@Override
	public int[] retrieveData() {
		int[] data = {1,2,3,4,5,6,7,8};
		return data;
	}
}
