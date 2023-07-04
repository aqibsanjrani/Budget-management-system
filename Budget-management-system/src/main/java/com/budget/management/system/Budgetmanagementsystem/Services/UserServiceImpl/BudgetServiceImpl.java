package com.budget.management.system.Budgetmanagementsystem.Services.UserServiceImpl;
import com.budget.management.system.Budgetmanagementsystem.Repository.BudgetRepository;
import com.budget.management.system.Budgetmanagementsystem.models.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.NotAcceptableStatusException;

import java.util.List;


@Service
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    @Autowired
    public BudgetServiceImpl(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @Override
    public Budget createBudget(Budget budget) {

        return budgetRepository.save(budget);
    }

    @Override
    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    @Override
    public Budget getBudgetById(Long budgetId) {
        return budgetRepository.findById(budgetId)
                .orElseThrow(() -> new NotAcceptableStatusException("Budget not found with ID: " + budgetId));
    }

    @Override
    public Budget updateBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    @Override
    public String deleteBudget(Long budgetId) {
        budgetRepository.deleteById(budgetId);

        return "Budget Record Deleted Successfully";
    }
}

