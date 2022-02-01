package com.example.mainmentbot.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.mainmentbot.domain.Role;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public class RegistrationRequest {
	
	private  String firstname;
	private  String lastname;
	private Long id;
	private  String password;
	private  String email;
	
	private int phonenum;
	private String addressline;
	private String city;
	private String state;
	private String country;    
	private int pincode;      
	  
	

	private Role role;



	public String getFirstName() {
		return firstname;
	}



	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}



	public String getLastName() {
		return lastname;
	}



	public void setLastName(String lastname) {
		this.lastname = lastname;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getPhoneNum() {
		return phonenum;
	}



	public void setPhoneNum(int phonenum) {
		this.phonenum = phonenum;
	}



	public String getAddressLine() {
		return addressline;
	}



	public void setAddressLine(String addressline) {
		this.addressline = addressline;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}
	
	}
	
	
