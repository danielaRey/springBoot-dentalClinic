package com.example.response;


import com.example.entity.Dentist;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DentistResponse {
	@JsonIgnore
	private Long id;
	
	private String name;
	
	//@JsonProperty("last_name")
	private String lastName;
	
	private String email;
	
	private Integer phoneNumber;
	
	public DentistResponse(Dentist dentist) {
		this.id = dentist.getId();
		this.name = dentist.getName();
		this.lastName = dentist.getLastName();
		this.email = dentist.getEmail();
		this.phoneNumber = dentist.getPhoneNumber();
	}
}
