package com.dhanush.info.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.dhanush.model.Details;
@Repository("detailDao")
public class DetailDaoImpl implements DetailDao {
	List<Details> detail;
	public List<Details> getAllDetailByName(Optional<String> name){			
		detail = new ArrayList<Details>();
		Details de = new Details();
		de.setName("Dhanush");
		de.setFirstname("dan");
		de.setLastnmae("d");
		de.setHobbies("cricket");
		de.setAddress("main");
		de.setProfession("dev");
		de.setDob(12);
		de.setSsn(12);
		de.setAge("o");
		de.setBloodgroup("l");
		de.setEmployment("d");
		detail.add(de);
		return detail;
		
		
	}



}
