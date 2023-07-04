package com.budget.management.system.Budgetmanagementsystem.Services;

import com.budget.management.system.Budgetmanagementsystem.models.Expense;

import java.math.BigDecimal;
import java.util.Date;

public interface ExpenseService {
    Expense createExpense(int consumerId, BigDecimal amount, Date date, int empGroupId, String description);
}
