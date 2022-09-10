package com.api.rest.service;

import java.util.List;

import com.api.rest.entity.Entries;

public interface ApiService {
	
	
	Entries saveEntity(Entries entity);
	 
    // Read operation
    List<Entries> fetchEntityList();
		
 
    // Update operation
    Entries updateEntity(Entries entity);
 
    // Delete operation
    void deleteEntityById(Long entityId);
	
}


