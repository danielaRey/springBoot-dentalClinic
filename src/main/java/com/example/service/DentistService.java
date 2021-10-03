package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Dentist;
import com.example.repository.DentistRepository;
import com.example.request.DentistRequest;

@Service
public class DentistService {
	@Autowired
	DentistRepository dentistRepository;
	
	public Dentist createDentist(DentistRequest dentistRequest) {
		Dentist dentist = new Dentist(dentistRequest);
		dentist = dentistRepository.save(dentist);
		return dentist;
	}
	
	public Dentist getDentistById(long id) {
		return dentistRepository.getById(id);
	}
	
	public List<Dentist> getAllDentists(){
		return dentistRepository.findAll();
	}
	
}
