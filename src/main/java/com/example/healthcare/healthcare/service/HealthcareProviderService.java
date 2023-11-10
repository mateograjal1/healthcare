package com.example.healthcare.healthcare.service;

import java.util.List;
import java.util.Optional;

import com.example.healthcare.healthcare.model.HealthcareProvider;

public interface HealthcareProviderService {

    List<HealthcareProvider> getAllProviders();

    Optional<HealthcareProvider> getProviderById(Long id);

    HealthcareProvider createProvider(HealthcareProvider provider);

    HealthcareProvider updateProvider(Long id, HealthcareProvider provider);

    void deleteProvider(Long id);
}
