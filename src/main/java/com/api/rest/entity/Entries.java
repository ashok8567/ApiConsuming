package com.api.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "entries")
public class Entries {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String api;
	private String description;
	private String auth;
	private Boolean hTTP;
	private String cors;
	private String link;
	private String category;
	public Entries( String api, String description, String auth, Boolean hTTP, String cors, String link,
			String category) {
		super();
		this.api = api;
		this.description = description;
		this.auth = auth;
		this.hTTP = hTTP;
		this.cors = cors;
		this.link = link;
		this.category = category;
	}
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getApi() {
		return api;
	}


	public void setApi(String api) {
		this.api = api;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getAuth() {
		return auth;
	}


	public void setAuth(String auth) {
		this.auth = auth;
	}


	public Boolean gethTTP() {
		return hTTP;
	}


	public void sethTTP(Boolean hTTP) {
		this.hTTP = hTTP;
	}


	public String getCors() {
		return cors;
	}


	public void setCors(String cors) {
		this.cors = cors;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	
	
	

}
