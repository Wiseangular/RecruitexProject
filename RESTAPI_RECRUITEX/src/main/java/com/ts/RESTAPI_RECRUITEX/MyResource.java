package com.ts.RESTAPI_RECRUITEX;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ts.dto.Recruiter;
import com.ts.dao.RecruiterDAO;
import com.ts.dto.User;
import com.ts.dao.UserDAO;


@Path("myresource")
public class MyResource {
	@Path("hi")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hi() throws UnsupportedEncodingException {
		System.out.println("Hi...");
		return "Hi Service!";
	}
	
	@Path("registerUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerUser(User user) {
		System.out.println("Data Recieved in User Register : " + user);
		UserDAO userDao = new UserDAO();
		userDao.register(user);
	}
	
	@Path("registerRecruiter")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerRecruiter(Recruiter recruiter) {
		System.out.println("Data Recieved in Recruiter Register : " + recruiter);
		RecruiterDAO recruiterDao = new RecruiterDAO();
		recruiterDao.register(recruiter);
	}
	
	@Path("getUserByUserPass/{emailId}/{password}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserByUserPass(@PathParam("emailId") String emailId,@PathParam("password") String password) {
		System.out.println("Recieved path params: "+emailId+" "+password); 
		UserDAO userDAO = new UserDAO();
		User user = userDAO.getUserByUserPass(emailId, password);
		return user;
	}
	
	@Path("getRecruiterByPass/{emailId}/{password}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Recruiter getRecruiterByRecruiterPass(@PathParam("emailId") String emailId,@PathParam("password") String password) {
		System.out.println("Recieved path params: "+emailId+" "+password); 
		RecruiterDAO recruiterDAO = new RecruiterDAO();
		Recruiter recruiter = recruiterDAO.getRecruiterByPass(emailId, password);
		return recruiter;
	}


	


	//It is sample code if need to test and insert values into any tables
//	@Path("registerUser")
//	@GET
//	public void registerUser() {
//		
//		User user = new User();
//		user.setUserId(1);
//		user.setUserFirstName("Lavanya");
//		user.setUserLastName("Vipparla");
//		user.setEmailId("sjhg@gmail.com");
//		user.setPassword("hjsdh");
//		user.setMobile("978435695");
//		user.setType("Job seeker");
//		
//		UserDAO userDao = new UserDAO();
//		userDao.register(user);
//	
//	}
	
//	@Path("registerRecruiter")
//	@GET
//	public void registerRecruiter() {
//		Recruiter recruiter = new Recruiter();
//		recruiter.setRecruiterId(1);
//		recruiter.setCompanyName("IBM");
//		recruiter.setJobPosition("Softwate developer");		
//		
//		RecruiterDAO recruiterDao = new RecruiterDAO();
//		recruiterDao.register(recruiter);
//	
//	}
	
}

