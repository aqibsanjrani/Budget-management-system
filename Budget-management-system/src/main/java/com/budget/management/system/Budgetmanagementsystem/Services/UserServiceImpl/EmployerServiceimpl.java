package com.budget.management.system.Budgetmanagementsystem.Services.UserServiceImpl;

import com.budget.management.system.Budgetmanagementsystem.Repository.EmployerRepository;
import com.budget.management.system.Budgetmanagementsystem.Services.UserService;
import com.budget.management.system.Budgetmanagementsystem.models.Employer;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class EmployerServiceimpl implements UserService {

    @Autowired
    private EmployerRepository expenseRepository;


    public EmployerServiceimpl(EmployerRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Employer createExpense(Employer expense) {

       //LocalDate today= LocalDate.now();

        expense.getEmployers_id();
        expense.getUsername();
        expense.getPassword();
        expense.getDesignation()
        ;
        return expenseRepository.save(expense);
    }

    @Override
    public List<Employer> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public Employer getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    return "Your Delete user is successfully";
    }

    // Other methods as needed
}

