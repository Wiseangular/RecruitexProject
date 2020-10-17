package com.ts.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Recruiter {
	@Id
	@GeneratedValue
	private int recruiterId;
	private String companyName;
	private String emailId;
	private String mobile;
	private String password;
	public int getRecruiterId() {
		return recruiterId;
	}
	public void setRecruiterId(int recruiterId) {
		this.recruiterId = recruiterId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Recruiter [recruiterId=" + recruiterId + ", companyName=" + companyName + ", emailId=" + emailId
				+ ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	
		
	
}
