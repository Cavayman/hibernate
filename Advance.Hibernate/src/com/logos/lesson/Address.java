package com.logos.lesson;

import java.util.List;

import javax.persistence.*;

@Entity
public class Address {

	@Id 
	@GeneratedValue
	private Long id;
	@Column(name="city_name",nullable=false,length=55)
	private String city ; 
	@Column(name="country",nullable=false,length=55)
	private String country ; 
	@OneToMany(mappedBy="address",fetch=FetchType.LAZY)
	private List<User> user ;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	
	
	
}
