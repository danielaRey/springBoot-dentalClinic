package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Patient;
import com.example.repository.PatientRepository;
import com.example.request.PatientRequest;


@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	public Patient createPatient (PatientRequest patientRequest) {
		Patient patient = new Patient(patientRequest);
		patient = patientRepository.save(patient);
		return patient;
	}
	
	public Patient getPatientById(long id) {
		return patientRepository.getById(id);
	}
	
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}
	
	
}
