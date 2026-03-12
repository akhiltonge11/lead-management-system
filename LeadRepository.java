package com.hsr.leadmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hsr.leadmanagement.model.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}
