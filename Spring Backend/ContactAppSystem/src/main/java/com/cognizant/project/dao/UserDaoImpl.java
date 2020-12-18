package com.cognizant.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.entity.Contact;
import com.cognizant.project.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDAO {

	@Autowired
	private SessionFactory factory;
	@Override
	@Transactional
	public List<Contact> getAllContacts()
	{
	Session session=factory.getCurrentSession();
	Query<User> query=session.createQuery("from contact order by firstName",User.class);
	List<User> listOfContact= query.getResultList();
	System.out.println("****");
	listOfContact.forEach(s -> System.out.println(s));
	System.out.println("****");
	return listOfContact;
	}


	@Override
	@Transactional
	public void saveUser(User user)
	{
	Session session=factory.getCurrentSession();
	session.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void saveContact(Contact contact)
	{
	Session session=factory.getCurrentSession();
	session.saveOrUpdate(contact);
	}



	@Override
	@Transactional
	public User getUser(int theId)
	{
	Session session=factory.getCurrentSession();
	User user=session.get(User.class, theId);
	return user;
	}


	@Override
	@Transactional
	public void deleteUser(int theId) {
	Session session=factory.getCurrentSession();
	User c=session.get(User.class, theId);
	session.delete(c);
	System.out.println(theId+":User deleted");
	}


	@Override
	@Transactional
	public List<User> getUserbyNameorId(String val) {
		Session session=factory.getCurrentSession();
		Query<User> query=session.createQuery("from user where firstName like '"+val+"%' or "
				+ "lastName like '"+val+"%' or concat(firstName,lastName) "
						+ "like '"+val+"%' or id='"+val+"%' order by id");
		List<User> userList=query.getResultList();
		return userList;
	}



}
