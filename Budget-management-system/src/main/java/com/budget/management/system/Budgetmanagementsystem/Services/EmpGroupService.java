package com.budget.management.system.Budgetmanagementsystem.Services;

import com.budget.management.system.Budgetmanagementsystem.models.EmpGroup;

public interface EmpGroupService {
    EmpGroup createEmpGroup(int empGroupId, int employerId, int budgetId);
}
