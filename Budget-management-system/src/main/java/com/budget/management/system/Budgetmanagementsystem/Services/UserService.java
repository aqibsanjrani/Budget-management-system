package com.budget.management.system.Budgetmanagementsystem.Services;

import com.budget.management.system.Budgetmanagementsystem.models.Employer;

import java.util.List;

public interface UserService {


    Employer createExpense(Employer expense);

    List<Employer> getAllExpenses() ;

    Employer getExpenseById(Long id);

    String deleteExpense(Long id);
}