package com.example.healthcare.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.healthcare.model.Medication;
import com.example.healthcare.healthcare.repository.MedicationRepository;
import com.example.healthcare.healthcare.service.MedicationService;

import java.util.List;
import java.util.Optional;

@Service("medicationServiceImpl")
public class MedicationServiceImpl implements MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    @Override
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    @Override
    public Optional<Medication> getMedicationById(Long id) {
        return medicationRepository.findById(id);
    }

    @Override
    public Medication createMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    @Override
    public Medication updateMedication(Long id, Medication medication) {
        if (medicationRepository.existsById(id)) {
            medication.setId(id);
            return medicationRepository.save(medication);
        }
        return null; // Handle error or throw an exception if the medication doesn't exist
    }

    @Override
    public void deleteMedication(Long id) {
        medicationRepository.deleteById(id);
    }
}
