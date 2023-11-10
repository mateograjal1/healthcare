package com.example.healthcare.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthcare.healthcare.model.HealthcareProvider;

public interface HealthcareProviderRepository extends JpaRepository<HealthcareProvider, Long> {
    // You can add custom query methods here if needed
}
