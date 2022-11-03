package com.demo.crudop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  //automatically search in database and map this class to database table name
public class Student {
	
	//as per database id is primary key and auto_increment
	@Id  //helps us id is primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //program will auto generate id(this is coding representation)
	private int id;
	private String sname;
	private String scourse;
	private int sfee;
	//generate getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public int getSfee() {
		return sfee;
	}
	public void setSfee(int sfee) {
		this.sfee = sfee;
	}
	
	

}
