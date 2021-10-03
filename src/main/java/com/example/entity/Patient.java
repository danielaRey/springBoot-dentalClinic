package com.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.request.PatientRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patient")
@Getter
@Setter
@NoArgsConstructor
public class Patient {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private Integer phoneNumber;
	
	@Column(name = "birth_date")
	private Date birthDate;
	
	@OneToMany(mappedBy = "patient")
	private List<Appointment> appointments;
	
	public Patient(PatientRequest patientRequest) {
		this.id = patientRequest.getId();
		this.name = patientRequest.getName();
		this.lastName = patientRequest.getLastName();
		this.email = patientRequest.getEmail();
		this.phoneNumber = patientRequest.getPhoneNumber();
		this.birthDate = patientRequest.getBirthDate();
	}
	
}
