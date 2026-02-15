package com.resale.homeflycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resale.homeflycustomer.model.Configuration;

import java.util.Optional;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Integer> {

    Optional<Configuration> findByConfigKeyAndIsActiveTrue(String key);
}