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
public class Domain {
	@Id
	@GeneratedValue
	private int domainId;
	private String domain;
	private String category;
	
	@ManyToMany
	@JoinColumn(name = "userId")
	private User user;
	
	@ManyToMany(mappedBy="Domain")
	List<User> userList = new ArrayList<User>();
	
	public Domain(int domainId, String domain, String category) {
		super();
		this.domainId = domainId;
		this.domain = domain;
		this.category = category;
	}
	public int getDomainId() {
		return domainId;
	}
	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
