package com.realestatewebapp.model;

public class AgentDTO {
	private Long id;
	private String username;
	private String gender;
	private String email;
	private String mobileNumber;
	private Role role;
	

	public AgentDTO(Long id, String username, String gender, String email, String mobileNumber, Role role) {
		super();
		this.id = id;
		this.username = username;
		this.gender = gender;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public AgentDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
