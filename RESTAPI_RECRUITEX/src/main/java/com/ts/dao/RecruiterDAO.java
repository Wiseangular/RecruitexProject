package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Recruiter;
import com.ts.dto.User;

public class RecruiterDAO {
	private SessionFactory factory = null;

	public Recruiter getRecruiterByPass(String emailId,String password) {

		return (Recruiter)HibernateTemplate.getObjectByPass(emailId,password);
	}

	public int register(Recruiter recruiter) {
		System.out.println(recruiter); 
		return HibernateTemplate.addObject(recruiter);
	}

}
