package com.powwow.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private byte active;

	private Timestamp created_on;

	private String email_id;

	private String password;

	private String username;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Timestamp getCreatedOn() {
		return this.created_on;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.created_on = createdOn;
	}

	public String getEmailId() {
		return this.email_id;
	}

	public void setEmailId(String emailId) {
		this.email_id = emailId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}
}