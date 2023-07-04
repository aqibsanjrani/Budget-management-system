package com.budget.management.system.Budgetmanagementsystem.Controllers;

import com.budget.management.system.Budgetmanagementsystem.Repository.EmployerRepository;
import com.budget.management.system.Budgetmanagementsystem.models.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User-login")
public class LoginController {

    @Autowired
    private EmployerRepository employerRepository;

    public LoginController(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @GetMapping ("/login")
    public ResponseEntity<String> login(@RequestBody Employer login) {
        Employer employee = employerRepository.findByUsername(login.getUsername());

        if (employee == null || !employee.getPassword().equals(login.getPassword())) {

            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }

        return ResponseEntity.ok("Login successful");
    }
}

