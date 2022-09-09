package com.api.rest.serviceimpl;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.entity.ApiData;
import com.api.rest.repository.Repository;

@Service
public class Serviceimpl  implements Service {
	
		 
		   @Autowired 
		    Repository repo;
		 
		    public ApiData saveEntity(ApiData apiData)
		    {
		        return repo.save(apiData);
		    }
		 
		    // Read operation
		    public List<ApiData> fetchEntityList()
		    {
		        return (List<ApiData>)
		        		repo.findAll();
		    }
		 
		    // Update operation
		    public ApiData updateEntity(ApiData apiData,
		                     Long entityId)
		    {
		    	ApiData depDB = ((Optional<ApiData>) repo.findById(entityId)).get();
		 
		       
		    }

			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String value() {
				// TODO Auto-generated method stub
				return null;
			}
		}




}
