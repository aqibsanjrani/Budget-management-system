package com.budget.management.system.Budgetmanagementsystem.Repository;

import com.budget.management.system.Budgetmanagementsystem.models.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends JpaRepository<Budget , Long> {
}
