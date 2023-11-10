package com.example.healthcare.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthcare.healthcare.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // You can add custom query methods here if needed
}
