package com.example.response;

import java.util.Date;

import com.example.entity.Patient;
import com.example.request.PatientRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientResponse {

	@JsonIgnore
	private Long id;
	
	private String name;
	
	//@JsonProperty("last_name")
	private String lastName;
	
	private String email;
	
	private Integer phoneNumber;
	
	private Date birthDate;
	
	public PatientResponse(Patient patient) {
		this.id = patient.getId();
		this.name = patient.getName();
		this.lastName = patient.getLastName();
		this.email = patient.getEmail();
		this.phoneNumber = patient.getPhoneNumber();
		this.birthDate = patient.getBirthDate();
	}
	
}
