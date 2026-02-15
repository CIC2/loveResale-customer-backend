package com.resale.homeflycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resale.homeflycustomer.model.CustomerInterest;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerInterestRepository extends JpaRepository<CustomerInterest, Long>{
    List<CustomerInterest> findAllByCustomerId(Long customerId);
}
