package com.cognizant.project.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.entity.Contact;
import com.cognizant.project.entity.User;

@Transactional
@Service
public interface UserService {

	public void saveUser(User user);
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();


	public void deleteUser(int theId);

	public User getUser(int theId);
	
}
