package com.cognizant.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.dao.UserDAO;
import com.cognizant.project.entity.Contact;
import com.cognizant.project.entity.User;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;


	@Override
	@Transactional
	public List<Contact> getAllContacts()
	{
	return userDao.getAllContacts();
	}


	@Override
	@Transactional
	public void saveUser(User user) {
	userDao.saveUser(user);
	}

	@Override
	@Transactional
	public void saveContact(Contact contact) {
	userDao.saveContact(contact);
	}


	@Override
	@Transactional
	public User getUser(int theId)
	{
	return userDao.getUser(theId);
	}


	@Override
	@Transactional
	public void deleteUser(int theId)
	{
	userDao.deleteUser(theId);
	}


	

}
