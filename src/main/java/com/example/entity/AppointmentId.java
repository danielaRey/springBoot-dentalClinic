package com.example.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class AppointmentId implements Serializable {

	private Date dateAppt;
	
	private String timeAppt;
	
	private Patient patient;

}
