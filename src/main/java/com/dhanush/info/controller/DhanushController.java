package com.dhanush.info.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhanush.info.service.DetailServicesImpl;
import com.dhanush.model.*;





@RestController
public class DhanushController {
	public static final Logger logger = LoggerFactory.getLogger(DhanushController.class);

@Autowired
DetailServicesImpl detailServiceImpl;

@RequestMapping(value = {"/getDetails/{name}", "/getDetails"}, method = RequestMethod.GET)

public ResponseEntity<List<Details>> getDetail(@PathVariable Optional<String> name){
	List<Details> detail = new ArrayList<Details>();
	detail = detailServiceImpl.getAllDetailByName(name); 
	return new ResponseEntity<List<Details>>(detail, HttpStatus.OK);
	
}

}

