package com.resale.homeflycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resale.homeflycustomer.model.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Integer> {
}
