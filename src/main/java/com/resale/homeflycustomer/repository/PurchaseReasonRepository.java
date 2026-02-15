package com.resale.homeflycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resale.homeflycustomer.model.PurchaseReason;

@Repository
public interface PurchaseReasonRepository extends JpaRepository<PurchaseReason, Integer> {

}
