package com.example.healthcare.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.healthcare.healthcare.model.HealthcareProvider;
import com.example.healthcare.healthcare.service.HealthcareProviderService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/providers")
public class HealthcareProviderController {

    @Autowired
    @Qualifier("healthcareProviderServiceImpl")
    private HealthcareProviderService providerService;

    @GetMapping
    public List<HealthcareProvider> getAllProviders() {
        return providerService.getAllProviders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HealthcareProvider> getProviderById(@PathVariable Long id) {
        Optional<HealthcareProvider> provider = providerService.getProviderById(id);
        return provider.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<HealthcareProvider> createProvider(@RequestBody HealthcareProvider provider) {
        HealthcareProvider createdProvider = providerService.createProvider(provider);
        return new ResponseEntity<>(createdProvider, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HealthcareProvider> updateProvider(@PathVariable Long id, @RequestBody HealthcareProvider provider) {
        HealthcareProvider updatedProvider = providerService.updateProvider(id, provider);
        if (updatedProvider != null) {
            return new ResponseEntity<>(updatedProvider, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProvider(@PathVariable Long id) {
        providerService.deleteProvider(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
