package com.marketingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingApp.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
