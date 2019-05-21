package com.dhanush.info.dao;

import java.util.List;
import java.util.Optional;

import com.dhanush.model.Details;

public interface DetailDao {

	List<Details> getAllDetailByName(Optional<String> name);

}
