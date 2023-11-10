package com.example.healthcare.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.healthcare.model.Patient;
import com.example.healthcare.healthcare.repository.PatientRepository;
import com.example.healthcare.healthcare.service.PatientService;

import java.util.List;
import java.util.Optional;

@Service("patientServiceImpl")
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Long id, Patient patient) {
        if (patientRepository.existsById(id)) {
            patient.setId(id);
            return patientRepository.save(patient);
        }
        return null; // Handle error or throw an exception if the patient doesn't exist
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
