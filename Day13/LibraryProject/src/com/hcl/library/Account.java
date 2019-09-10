package com.hcl.library;

import java.util.Date;

public class Account {
 private String username;
 private int id;
 private Date d;
 
 
public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public Date getD() {
	return d;
}


public void setD(Date d) {
	this.d = d;
}


public Account(String username, int id, Date d) {
	super();
	this.username = username;
	this.id = id;
	this.d=d;
	
}





 
}
