package com.example.healthcare.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthcare.healthcare.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // You can add custom query methods here if needed
}