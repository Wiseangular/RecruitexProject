package com.ts.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.dto.User;
import com.ts.db.HibernateTemplate;

public class UserDAO {

	private SessionFactory factory = null;

	public User getUserByUserPass(String emailId,String password) {

		return (User)HibernateTemplate.getObjectByUserPass(emailId,password);
	}

	public int register(User user) {
		System.out.println(user); 
		return HibernateTemplate.addObject(user);
	}

}