package org.itstep.service.impl;

import org.itstep.model.SpringPojo;
import org.itstep.service.SpringService;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.stereotype.Service;

@Service
public class SpringServiceImpl implements SpringService{

	public SpringPojo getMethod1() {
		return new SpringPojo(123, "test name", Boolean.TRUE);
	}
	
	public String getMethod2() {
		return "It was GET2 method!";
	}

	public String putMethod() {
		return "It was PUT method!";
	}

	public String postMethod() {
		return "It was POST method!";
	}

	public String deleteMethod() {
		return "It was DELETE method!";
	}

}
