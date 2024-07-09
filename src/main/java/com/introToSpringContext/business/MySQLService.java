package com.introToSpringContext.business;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLService implements DataService {
	
	@Override
	public int[] retrieveData() {
		int[] data = {8,7,6,5,4,3,2,1,0};
		return data;
	}
}
