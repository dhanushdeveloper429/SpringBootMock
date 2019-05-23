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
		
		
		Details de1  = new Details();
		de1.setName("Dhanush");
		de1.setFirstname("dan");
		de1.setLastnmae("d");
		de1.setHobbies("cricket");
		de1.setAddress("main");
		de1.setProfession("dev");
		de1.setDob(12);
		de1.setSsn(12);
		de1.setAge("o");
		de1.setBloodgroup("l");
		de1.setEmployment("d");
		Details de2  = new Details();
		de2.setName("Dhanush");
		de2.setFirstname("dan");
		de2.setLastnmae("d");
		de2.setHobbies("cricket");
		de2.setAddress("main");
		de2.setProfession("dev");
		de2.setDob(12);
		de2.setSsn(12);
		de2.setAge("o");
		de2.setBloodgroup("l");
		de2.setEmployment("d");
		
		detail.add(de1);
		detail.add(de2);
		detail.add(de);
		return detail;
		
		
	}



}
