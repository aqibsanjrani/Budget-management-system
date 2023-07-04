package com.budget.management.system.Budgetmanagementsystem.Services.UserServiceImpl;

import com.budget.management.system.Budgetmanagementsystem.models.Budget;

import java.util.List;

public interface BudgetService {
    Budget createBudget(Budget budget);

    List<Budget> getAllBudgets();

    Budget getBudgetById(Long budgetId);

    Budget updateBudget(Budget budget);

    String deleteBudget(Long budgetId);
}
