package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.request.DentistRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dentist")
@Getter
@Setter
@NoArgsConstructor
public class Dentist {

	@Id
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
	
//	@OneToMany(mappedBy = "dentist")
//	private List<Appointment> appointments;
	
	public Dentist(DentistRequest dentistRequest) {
		this.id = dentistRequest.getId();
		this.name = dentistRequest.getName();
		this.lastName = dentistRequest.getLastName();
		this.email = dentistRequest.getEmail();
		this.phoneNumber = dentistRequest.getPhoneNumber();
	}
	
}
