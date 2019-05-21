package com.dhanush.info.service;

import java.util.List;
import java.util.Optional;

import com.dhanush.model.Details;



public interface DetailServices {
	public List<Details> getAllDetailByName(Optional<String> name);
}
