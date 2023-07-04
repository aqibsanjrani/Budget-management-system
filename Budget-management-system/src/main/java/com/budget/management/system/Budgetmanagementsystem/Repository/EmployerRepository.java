package com.budget.management.system.Budgetmanagementsystem.Repository;

import com.budget.management.system.Budgetmanagementsystem.models.Employer;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {

    Employer findByUsername(String username);

}
