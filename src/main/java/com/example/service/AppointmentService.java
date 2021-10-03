package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Appointment;
import com.example.entity.Dentist;
import com.example.entity.Patient;
import com.example.repository.AppointmentRepository;
import com.example.repository.DentistRepository;
import com.example.repository.PatientRepository;
import com.example.request.AppointmentRequest;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository; 
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	DentistRepository dentistRepository;
	
	public Appointment createAppointment(AppointmentRequest appointmentRequest) {
		Appointment appointment = new Appointment(appointmentRequest);
		
		Patient patient = patientRepository.getById(appointmentRequest.getPatientId());
		appointment.setPatient(patient);
		
//		Dentist dentist = dentistRepository.getById(Long.parseLong("1"));
//		appointment.setDentist(dentist);
//		String name = appointment.getPatient().getName();
		appointment = appointmentRepository.save(appointment);
		
		return appointment;
	}
	
}
