package com.hsr.leadmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsr.leadmanagement.model.Lead;
import com.hsr.leadmanagement.repository.LeadRepository;

@Service
public class LeadService {

    @Autowired
    private LeadRepository leadRepository;

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    public Lead saveLead(Lead lead) {
        return leadRepository.save(lead);
    }

    public void deleteLead(Long id) {
        leadRepository.deleteById(id);
    }
}
