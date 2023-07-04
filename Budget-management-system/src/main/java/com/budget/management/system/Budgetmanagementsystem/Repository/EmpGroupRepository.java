package com.budget.management.system.Budgetmanagementsystem.Repository;

import com.budget.management.system.Budgetmanagementsystem.models.EmpGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpGroupRepository extends JpaRepository<EmpGroup, Integer> {

}
