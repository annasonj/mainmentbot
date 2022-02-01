package com.example.mainmentbot.service;

import java.util.stream.Collectors;

//import org.apache.catalina.User;
import com.example.mainmentbot.domain.User;
import org.springframework.*;

public class UserDetailsImpl implements UserDetails{
	
	private Long id;
	private String username;
	private String email;
	@JsonIgnore
	private String password;
	
	private Collection<? extends GrantedAuthority> authorities;
	public UserDetailsImpl(Long id,String username,String email,String password,Collection<? extends GrantedAuthority> authorities) {
		this.id=id;
		this.username=username;
		this.email=email;
		this.password=password;
		this.authorities=authorities;
	}
	
	public static UserDetailsImplbuild(User user) {
		List<GrantedAuthority>authorities = user.getRoles().stream().map(role->new SimpleGrantedAuthority(role.getName().name()))
				.collect(Collectors.toList());
		
		return new UserDetailsImpl(user.getId(),user.getUsername(),user.getEmail(),user.getPassword(),authorities);
	}
}