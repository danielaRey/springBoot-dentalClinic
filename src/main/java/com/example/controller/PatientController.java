package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Patient;
import com.example.request.PatientRequest;
import com.example.response.PatientResponse;
import com.example.service.PatientService;

@RestController
//@RequestMapping("/api/patients/")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping("/patients")
	public PatientResponse createPatient(@Valid @RequestBody PatientRequest patientRequest) {
		Patient patient = patientService.createPatient(patientRequest);
		
		return new PatientResponse(patient);
	}
	
	@GetMapping("/patients")
	public List<PatientResponse> getAllPatients(){
		List<Patient> patientListService = patientService.getAllPatients();
		List<PatientResponse> patientResponseList = new ArrayList<PatientResponse>();
		
		patientListService.stream().forEach(patient -> {
			patientResponseList.add(new PatientResponse(patient));
		});
		
		return patientResponseList;
	}
	
	@GetMapping("/patients/{id}")
	public PatientResponse getPatientById(@PathVariable long id) {
		Patient patient = patientService.getPatientById(id);
		
		return new PatientResponse(patient);
	}
	

}
