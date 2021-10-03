package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Appointment;
import com.example.entity.AppointmentId;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
