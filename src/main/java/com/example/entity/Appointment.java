package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.request.AppointmentRequest;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "appointment")
@NoArgsConstructor
@Data
//@IdClass(AppointmentId.class)
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "date_appt")
	private Date dateAppt;
	
	@Column(name = "time_appt")
	private String timeAppt;
	
//	@Column(name = "creation_date")
//	private Date creationDate;
	
	
	public Appointment(AppointmentRequest appointmentRequest) {
		this.reason = appointmentRequest.getReason();
		this.dateAppt = appointmentRequest.getDateAppt();
		this.timeAppt = appointmentRequest.getTimeAppt();
	}

}
