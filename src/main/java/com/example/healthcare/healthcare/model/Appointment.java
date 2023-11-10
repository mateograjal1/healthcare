package com.example.healthcare.healthcare.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date appointmentDate;

    // Define a relationship between Appointment and Patient
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // Define a relationship between Appointment and HealthcareProvider
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private HealthcareProvider healthcareProvider;

    // Add more fields as needed
}