package com.api.rest.serviceimpl;

import java.util.List;

import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.entity.Entries;
import com.api.rest.repository.ApiRepository;
import com.api.rest.service.ApiService;

@Service
public class Serviceimpl implements ApiService {
	
	@Autowired
	private ApiRepository apiRepository ;
	
	
	@Override
	public Entries saveEntity(Entries entity) {
		System.out.println("Save Entity");
		Entries data = apiRepository.save(entity);
		return data;
	}

	@Override
	public List<Entries> fetchEntityList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entries updateEntity(Entries entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntityById(Long entityId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}




