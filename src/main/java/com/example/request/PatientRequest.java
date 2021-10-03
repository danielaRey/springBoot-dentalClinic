package com.example.request;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientRequest {

	@NotNull(message = "ID is required")
	private Long id;
	
	private String name;
	
	//@JsonProperty("last_name")
	private String lastName;
	
	@Email(message = "Email should be valid")
	private String email;
	
	private Integer phoneNumber;
	
	private Date birthDate;
}
