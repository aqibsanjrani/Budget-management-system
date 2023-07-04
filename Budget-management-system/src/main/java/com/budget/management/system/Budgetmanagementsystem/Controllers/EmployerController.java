package com.budget.management.system.Budgetmanagementsystem.Controllers;

import com.budget.management.system.Budgetmanagementsystem.Services.UserService;
import com.budget.management.system.Budgetmanagementsystem.models.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/budget-management")
public class EmployerController {

    @Autowired
    private UserService expenseService;

    @Autowired
    public EmployerController(UserService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/create-user") // Create New User
    public ResponseEntity<String> createExpense(@RequestBody Employer expense) {
        Employer createdExpense = expenseService.createExpense(expense);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/getAllUsers") // Get All Records
    public ResponseEntity<List<Employer>> getAllExpenses() {
        List<Employer> expenses = expenseService.getAllExpenses();
        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }

    @GetMapping("/{id}")  // Get Record by User ID
    public ResponseEntity<Employer> getExpenseById(@PathVariable Long id) {
        Employer expense = expenseService.getExpenseById(id);
        if (expense != null) {
            return new ResponseEntity<>(expense, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}") // Deleted Record by user ID
    public String deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    //    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return "User Record deleted Successfully";
    }

    // Other methods as needed
}

