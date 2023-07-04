package com.budget.management.system.Budgetmanagementsystem.Repository;
import com.budget.management.system.Budgetmanagementsystem.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
