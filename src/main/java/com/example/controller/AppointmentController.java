package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Appointment;
import com.example.request.AppointmentRequest;
import com.example.response.AppointmentResponse;
import com.example.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/appointments")
	public AppointmentResponse createAppointment(@Valid @RequestBody AppointmentRequest appointmentRequest) {
		Appointment appointment = appointmentService.createAppointment(appointmentRequest);
		return new AppointmentResponse(appointment);
	}
	
}
