package com.resale.homeflycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resale.homeflycustomer.model.ConfigCustomersActivity;

import java.util.Optional;

@Repository
public interface ConfigCustomersActivityRepository extends JpaRepository<ConfigCustomersActivity, Integer> {

    Optional<ConfigCustomersActivity> findByCustomerIdAndConfigKey(Long customerId,String key);
}