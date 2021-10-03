package com.example.response;

import java.util.Date;

import com.example.entity.Appointment;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentResponse {
	private Date dateAppt;
	
	private String timeAppt;

	private Long patientId;

//	private Long dentistId;

	private String reason;
	
	public AppointmentResponse(Appointment appointment) {
		this.dateAppt = appointment.getDateAppt();
		this.timeAppt = appointment.getTimeAppt();
		this.patientId = appointment.getPatient().getId();
//		this.dentistId = appointment.getDentist().getId();
		this.reason = appointment.getReason();
	}

}
