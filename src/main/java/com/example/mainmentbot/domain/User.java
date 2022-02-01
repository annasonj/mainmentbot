package com.example.mainmentbot.domain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String lastname;
	private Strinf username;
	private String password;
	private String email;
	private int phonenum;
	private String addressline;
	private String city;
	private String state;
	private String country;    
	private int pincode;      
	  
	private boolean locked=false;
	private boolean enabled=false;
	@Enumerated(EnumType.STRING)
	private Role role;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		SimpleGrantedAuthority authority=new SimpleGrantedAuthority(role.name());
		
		return Collections.singletonList(authority);
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}


	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public int getPhoneNum() {
		return phonenum;
	}

	
	public String getAddressLine() {
		return addressline;
	}

	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public int getPincode() {
		return pincode;
	}
	
	public Role getRole() {
		return role;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
     
	public void setUsername(String username) {
		this.username=username;
	}
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhoneNum(int phonenum) {
		this.phonenum=phonenum;
	}
	public void setAddressLine(String addressline) {
		this.addressline=addressline;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	public void setRole(Role role) {
		this.role=role;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return !locked;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}

	
	public User(String firstname, String lastname, String password, String email, int phonenum,
			String addressline, String city, String state, String country, int pincode,
			Role role) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.password = password;
		this.email = email;
		this.phonenum = phonenum;
		this.addressline = addressline;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	
		this.role = role;
	}


	
	
	
	

}
