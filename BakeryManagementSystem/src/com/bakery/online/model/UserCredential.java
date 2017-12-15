package com.bakery.online.model;

import javax.persistence.*;

@Entity
@Table(name = "bms_user_credential", catalog = "bmsdb")
public class UserCredential {

	@Id
	@Column(name = "email_id", nullable = false)
	private String emailId;
	@Column(name = "password", nullable = false)
	private String password;
	
		
	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	
}
