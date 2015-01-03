package com.saby.evs.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.saby.evs.dto.UserDto;

@JsonTypeName("UserRequest")
public class UserRequest {
	@JsonProperty("User")
	private UserDto userDto;

	@JsonProperty("IsEditable")
	private Boolean isEditable;

	@JsonIgnore
	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
	@JsonIgnore
	public Boolean getIsEditable() {
		return isEditable;
	}

	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}

	@JsonIgnore
	public Boolean getIsRemovable() {
		return isRemovable;
	}

	public void setIsRemovable(Boolean isRemovable) {
		this.isRemovable = isRemovable;
	}

	@JsonProperty("IsRemovable")
	private Boolean isRemovable;

}
