package com.cognizant.project.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	 private int id;
	
	@NotEmpty(message="first name cannot be null")
	
	@Column(name="first_name")	

	 private String firstName;
	
	 @Size(min =4,max =10)
     @Column(name="password")
	@NotEmpty(message="password cannot be null")
 private String userPass;
	 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotNull(message="Enter a valid date")
	 
	 private Date dob;
	 
	 @NotEmpty(message="Phn no cannot be null")
	 private String phn;
	 
	 
	public User() {
		super();
		
	}
	public User(int id, String firstName, String userPass, Date dob, String phn) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.userPass = userPass;
		this.dob = dob;
		this.phn = phn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", userPass=" + userPass + ", dob=" + dob + ", phn="
				+ phn + "]";
	}
	 


	

	
}
