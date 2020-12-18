package com.cognizant.project.dao;

import java.util.List;

import com.cognizant.project.entity.Contact;
import com.cognizant.project.entity.User;

public interface UserDAO {

	public void saveUser(User user);
	public void saveContact(Contact contact);
	
	public List<Contact> getAllContacts();



	public void deleteUser(int theId);

	public User getUser(int theId);

}
