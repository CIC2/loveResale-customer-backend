package com.resale.homeflycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resale.homeflycustomer.model.PurchaseSubReason;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseSubReasonRepository extends JpaRepository<PurchaseSubReason, Integer> {
    List<PurchaseSubReason> findAllByMainReasonId(Integer mainReasonId);
}
