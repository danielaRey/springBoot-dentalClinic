package com.example.request;

import java.util.Date;

import com.example.entity.Dentist;
import com.example.entity.Patient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentRequest {
	
	private Date dateAppt;
	
	private String timeAppt;

	private Long patientId;

//	private Long dentistId;

	private String reason;

}
