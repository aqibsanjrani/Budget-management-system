package com.budget.management.system.Budgetmanagementsystem.Controllers;
import com.budget.management.system.Budgetmanagementsystem.Services.UserServiceImpl.BudgetService;
import com.budget.management.system.Budgetmanagementsystem.models.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/budgets")
public class BudgetController {
    private final BudgetService budgetService;

    @Autowired
    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @PostMapping //Create the new budget....
    public ResponseEntity<Budget> createBudget(@RequestBody Budget budget) {
        Budget createdBudget = budgetService.createBudget(budget);
        return new ResponseEntity<>(createdBudget, HttpStatus.CREATED);
    }

    @GetMapping // Get All Record Budget
    public ResponseEntity<List<Budget>> getAllBudgets() {
        List<Budget> budgets = budgetService.getAllBudgets();
        return new ResponseEntity<>(budgets, HttpStatus.OK);
    }

    @GetMapping("/{budgetId}") //Get Record by Budget ID
    public ResponseEntity<Budget> getBudgetById(@PathVariable Long budgetId) {
        Budget budget = budgetService.getBudgetById(budgetId);
        return new ResponseEntity<>(budget, HttpStatus.OK);
    }

    @PutMapping("/{budgetId}")// Put The Any Update budget Record........!
    public ResponseEntity<Budget> updateBudget(@PathVariable Long budgetId, @RequestBody Budget budget) {
        budget.setBudgetId(budgetId);
        Budget updatedBudget = budgetService.updateBudget(budget);
        return new ResponseEntity<>(updatedBudget, HttpStatus.OK);
    }

    @DeleteMapping("/{budgetId}") // Deleted Record By Budget ID.....!
    public String deleteBudget(@PathVariable Long budgetId) {
        budgetService.deleteBudget(budgetId);
        return "Budget Record Deleted Successfully";
    }
}

