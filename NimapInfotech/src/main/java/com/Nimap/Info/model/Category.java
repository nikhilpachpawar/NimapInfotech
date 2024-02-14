package com.Nimap.Info.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Category {
	
	@Id
	
	private int categoryid;
	private String categorytype;
	private String categoryname;
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategorytype() {
		return categorytype;
	}
	public void setCategorytype(String categorytype) {
		this.categorytype = categorytype;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	

}
