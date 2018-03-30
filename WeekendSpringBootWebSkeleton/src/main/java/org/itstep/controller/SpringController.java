package org.itstep.controller;

import org.itstep.model.SpringPojo;
import org.itstep.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/spring-controller")
public class SpringController {

	@Autowired
	SpringService service;
	
	@GetMapping( path = "/get1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<SpringPojo> getMethod1(){
		return new ResponseEntity<SpringPojo>(service.getMethod1(), HttpStatus.OK);
	}
	
	@GetMapping( path = "/get2")
	ResponseEntity<String> getMethod2(){
		return new ResponseEntity<String>(service.getMethod2(), HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<String> postMethod(){
		return new ResponseEntity<String>(service.postMethod(), HttpStatus.OK);
	}
	
	@PutMapping
	ResponseEntity<String> putMethod(){
		return new ResponseEntity<String>(service.putMethod(), HttpStatus.OK);
	}
	
	@DeleteMapping
	ResponseEntity<String> deleteMethod(){
		return new ResponseEntity<String>(service.deleteMethod(), HttpStatus.OK);
	}
}
