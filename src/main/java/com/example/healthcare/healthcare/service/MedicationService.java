package com.example.healthcare.healthcare.service;

import java.util.List;
import java.util.Optional;

import com.example.healthcare.healthcare.model.Medication;

public interface MedicationService {

    List<Medication> getAllMedications();

    Optional<Medication> getMedicationById(Long id);

    Medication createMedication(Medication medication);

    Medication updateMedication(Long id, Medication medication);

    void deleteMedication(Long id);
}
