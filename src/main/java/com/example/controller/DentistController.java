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

import com.example.entity.Dentist;
import com.example.entity.Patient;
import com.example.request.DentistRequest;
import com.example.request.PatientRequest;
import com.example.response.DentistResponse;
import com.example.response.PatientResponse;
import com.example.service.DentistService;

@RestController
public class DentistController {
	
	@Autowired
	DentistService dentistService;
	
	@PostMapping("/dentists")
	public DentistResponse createDentist(@Valid @RequestBody DentistRequest dentistRequest) {
		Dentist dentist = dentistService.createDentist(dentistRequest);
		
		return new DentistResponse(dentist);
	}
	
	@GetMapping("/dentists")
	public List<DentistResponse> getAllDentists(){
		List<Dentist> dentistListService = dentistService.getAllDentists();
		List<DentistResponse> dentistResponseList = new ArrayList<DentistResponse>();
		
		dentistListService.stream().forEach(dentist -> {
			dentistResponseList.add(new DentistResponse(dentist));
		});
		
		return dentistResponseList;
	}
	
	@GetMapping("/dentists/{id}")
	public DentistResponse getDentistById(@PathVariable long id) {
		Dentist dentist = dentistService.getDentistById(id);
		
		return new DentistResponse(dentist);
	}
	

}
