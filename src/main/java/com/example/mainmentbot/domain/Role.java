package com.example.mainmentbot.domain;

public enum Role implements EnumWithText {
	PATIENT("Patient"),
	DOCTOR("Doctor"),
	ADMIN("admin");

	private String text;
	
    Role(String text) {this.text = text;}
	@Override
	public String getText() {
		return this.text;
	}
	
	

}
