package com.api.rest.entity;


public class ApiData {
	private String API;
	private String Description;
	private String Auth;
	private Boolean HTTP;
	private String Cors;
	private String Link;
	private String Category;
	public ApiData(String aPI, String description, String auth, Boolean hTTP, String cors, String link,
			String category) {
		super();
		API = aPI;
		Description = description;
		Auth = auth;
		HTTP = hTTP;
		Cors = cors;
		Link = link;
		Category = category;
	}
	public String getAPI() {
		return API;
	}
	public void setAPI(String aPI) {
		API = aPI;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getAuth() {
		return Auth;
	}
	public void setAuth(String auth) {
		Auth = auth;
	}
	public Boolean getHTTP() {
		return HTTP;
	}
	public void setHTTP(Boolean hTTP) {
		HTTP = hTTP;
	}
	public String getCors() {
		return Cors;
	}
	public void setCors(String cors) {
		Cors = cors;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getEntityName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEntityName(String entityName) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
