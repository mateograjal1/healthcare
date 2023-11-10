package com.example.healthcare.healthcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.healthcare.model.HealthcareProvider;
import com.example.healthcare.healthcare.repository.HealthcareProviderRepository;
import com.example.healthcare.healthcare.service.HealthcareProviderService;

import java.util.List;
import java.util.Optional;

@Service("healthcareProviderServiceImpl")
public class HealthcareProviderServiceImpl implements HealthcareProviderService {

    @Autowired
    private HealthcareProviderRepository providerRepository;

    @Override
    public List<HealthcareProvider> getAllProviders() {
        return providerRepository.findAll();
    }

    @Override
    public Optional<HealthcareProvider> getProviderById(Long id) {
        return providerRepository.findById(id);
    }

    @Override
    public HealthcareProvider createProvider(HealthcareProvider provider) {
        return providerRepository.save(provider);
    }

    @Override
    public HealthcareProvider updateProvider(Long id, HealthcareProvider provider) {
        if (providerRepository.existsById(id)) {
            provider.setId(id);
            return providerRepository.save(provider);
        }
        return null; // Handle error or throw an exception if the provider doesn't exist
    }

    @Override
    public void deleteProvider(Long id) {
        providerRepository.deleteById(id);
    }
}
