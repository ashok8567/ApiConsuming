package com.api.rest.repository;

import java.util.List;
import java.util.Optional;

import com.api.rest.entity.ApiData;

public interface Repository extends JpaRepository<ApiData,Long>{

	ApiData save(ApiData employee);

	List<ApiData> findAl1();

	Optional<ApiData> findById(Long employeeId);

	List<ApiData> findAll();
	

}
