package com.saby.evs.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("User")
public class UserDto {
	@JsonProperty("UserId")
	private String UserId;
	
	@JsonProperty("Password")
	private String Password;

	@JsonProperty("UserName")
	private String UserName;

	@JsonProperty("UserEmail")
	private String UserEmail;
	
	@JsonProperty("VoterId")
	private String VoterId;
	
	@JsonProperty("Constituency")
	private String Constituency;
	
	@JsonProperty("Status")
	private String Status;

	/**
	 * @return the userId
	 */
	@JsonIgnore
	public String getUserId() {
		return UserId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		UserId = userId;
	}

	/**
	 * @return the userName
	 */
	@JsonIgnore
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}

	/**
	 * @return the userEmail
	 */
	/**
	 * @return the password
	 */
	@JsonIgnore
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

	@JsonIgnore
	public String getUserEmail() {
		return UserEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	/**
	 * @return the voterId
	 */
	@JsonIgnore
	public String getVoterId() {
		return VoterId;
	}

	/**
	 * @param voterId the voterId to set
	 */
	public void setVoterId(String voterId) {
		VoterId = voterId;
	}

	/**
	 * @return the constituency
	 */
	@JsonIgnore
	public String getConstituency() {
		return Constituency;
	}

	/**
	 * @param constituency the constituency to set
	 */
	public void setConstituency(String constituency) {
		Constituency = constituency;
	}

	/**
	 * @return the status
	 */
	@JsonIgnore
	public String getStatus() {
		return Status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}
	
	
}
