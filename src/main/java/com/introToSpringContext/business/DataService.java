package com.introToSpringContext.business;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
	int[] retrieveData();

}
