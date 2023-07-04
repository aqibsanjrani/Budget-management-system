package com.budget.management.system.Budgetmanagementsystem.Controllers;

import com.budget.management.system.Budgetmanagementsystem.Playload.EmpGroupRequest;
import com.budget.management.system.Budgetmanagementsystem.Services.EmpGroupService;
import com.budget.management.system.Budgetmanagementsystem.models.EmpGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp-groups")
public class EmpGroupController {

    @Autowired
    private EmpGroupService empGroupService;

    @Autowired
    public EmpGroupController(EmpGroupService empGroupService) {
        this.empGroupService = empGroupService;
    }

    @PostMapping// Create the Employer group Data
    public EmpGroup createEmpGroup(@RequestBody EmpGroupRequest request) {
        int empGroupId = request.getEmpGroupId();
        int employerId = request.getEmployerId();
        int budgetId = request.getBudgetId();
        return empGroupService.createEmpGroup(empGroupId, employerId, budgetId);
    }

    // Other controller methods
}

