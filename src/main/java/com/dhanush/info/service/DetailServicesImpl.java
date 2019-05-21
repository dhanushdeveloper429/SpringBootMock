package com.dhanush.info.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanush.info.dao.DetailDaoImpl;
import com.dhanush.model.Details;


@Service("detailServices")
public class DetailServicesImpl implements DetailServices  {
	@Autowired
	DetailDaoImpl detailDaoImpl;
	
	@Autowired
	DetailServices detailService;

	public List<Details> getAllDetailByName(Optional<String> name) {
		
		List<Details> detail = new ArrayList<Details>();
		detail = detailDaoImpl.getAllDetailByName(name); 
		return detail;
	}

}
