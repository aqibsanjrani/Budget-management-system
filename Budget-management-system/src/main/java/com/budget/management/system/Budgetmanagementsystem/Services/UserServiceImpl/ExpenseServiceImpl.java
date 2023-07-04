package com.budget.management.system.Budgetmanagementsystem.Services.UserServiceImpl;
import com.budget.management.system.Budgetmanagementsystem.Repository.EmpGroupRepository;
import com.budget.management.system.Budgetmanagementsystem.Repository.ExpenseRepository;
import com.budget.management.system.Budgetmanagementsystem.Services.ExpenseService;
import com.budget.management.system.Budgetmanagementsystem.models.EmpGroup;
import com.budget.management.system.Budgetmanagementsystem.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private EmpGroupRepository empGroupRepository;

    @Autowired
    public ExpenseServiceImpl(ExpenseRepository expenseRepository, EmpGroupRepository empGroupRepository) {
        this.expenseRepository = expenseRepository;
        this.empGroupRepository = empGroupRepository;
    }

    @Override
    public Expense createExpense(int consumerId, BigDecimal amount, Date date, int empGroupId, String description) {
        Expense expense = new Expense();
        expense.setId(consumerId);
        expense.setAmount(amount);
        expense.setDate(date);
        expense.setDescription(description);

        // Fetch the related empGroup entity
        EmpGroup empGroup = empGroupRepository.findById(empGroupId)
                .orElseThrow(() -> new IllegalArgumentException("EmpGroup not found with ID: " + empGroupId));
        expense.setEmpGroup(empGroup);

        return expenseRepository.save(expense);


    }
}

