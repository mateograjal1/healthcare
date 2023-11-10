package com.example.healthcare.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthcare.healthcare.model.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
    // You can add custom query methods here if needed
}
