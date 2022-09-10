package com.api.rest.repository;

import org.springframework.stereotype.Repository;

import com.api.rest.entity.Entries;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ApiRepository extends JpaRepository<Entries,Long>{

}
