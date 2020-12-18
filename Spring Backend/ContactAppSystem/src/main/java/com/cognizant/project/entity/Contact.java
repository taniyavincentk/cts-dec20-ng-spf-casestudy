package com.cognizant.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="contact")
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	 private int id;
	
	@NotEmpty(message="name cannot be null")
	
	@Column(name="name")	

	 private String name;
	
	 @NotEmpty(message="Phn no cannot be null")
	 private String phn;

	 
	 
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Contact(int id, String name, String phn) {
		super();
		this.id = id;
		this.name = name;
		this.phn = phn;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phn=" + phn + "]";
	}
	 
	 
	 
	
}
