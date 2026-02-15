package com.resale.homeflycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resale.homeflycustomer.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
