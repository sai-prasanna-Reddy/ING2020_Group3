package com.uk.visaapp.reg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public  class User {
	
	@Id
	private Integer id;
	@Column(name="email_id")
	private String emailId;
	private String userName;
	private String password;
	public User()
	{
		
	}
	 public User(Integer id)
	{
		super();
		this.id=id;
		System.out.println("User object created");
	}
	
	
	public User(Integer id, String emailid, String userName, String password) {
		super();
		this.id = id;
		this.emailId = emailid;
		this.userName = userName;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailid) {
		this.emailId = emailid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
