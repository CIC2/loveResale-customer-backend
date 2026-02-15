package com.resale.homeflycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resale.homeflycustomer.model.Complain;

import java.time.LocalDateTime;

@Repository
public interface ComplainRepository extends JpaRepository<Complain, Integer> {
    @Query("SELECT count(c) from Complain c WHERE c.customerId = :customerId AND c.createdAt >= :fromTime")
    long countRecentComplains(@Param("customerId") Long customerId, @Param("fromTime") LocalDateTime fromTime);
}