package com.budget.management.system.Budgetmanagementsystem.Services.UserServiceImpl;
import com.budget.management.system.Budgetmanagementsystem.Repository.BudgetRepository;
import com.budget.management.system.Budgetmanagementsystem.Repository.EmpGroupRepository;
import com.budget.management.system.Budgetmanagementsystem.Repository.EmployerRepository;
import com.budget.management.system.Budgetmanagementsystem.Services.EmpGroupService;
import com.budget.management.system.Budgetmanagementsystem.models.Budget;
import com.budget.management.system.Budgetmanagementsystem.models.EmpGroup;
import com.budget.management.system.Budgetmanagementsystem.models.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpGroupServiceImpl implements EmpGroupService {

    @Autowired
    private EmpGroupRepository empGroupRepository;

    @Autowired
    private BudgetRepository budgetRepository;

    @Autowired
    private EmployerRepository employerRepository;

    @Autowired
    public EmpGroupServiceImpl(EmpGroupRepository empGroupRepository) {
        this.empGroupRepository = empGroupRepository;
    }

    @Override
    public EmpGroup createEmpGroup(int empGroupId, int employerId, int budgetId) {
        EmpGroup empGroup = new EmpGroup();
        empGroup.setGroupId(empGroupId);

        // Fetch the related employer and budget entities
        Employer employer = employerRepository.findById((long) employerId)
                .orElseThrow(() -> new IllegalArgumentException("Employer not found with ID: " + employerId));
        empGroup.setEmployer(employer);

        Budget budget = budgetRepository.findById((long) budgetId)
                .orElseThrow(() -> new IllegalArgumentException("Budget not found with ID: " + budgetId));
        empGroup.setBudget(budget);

        return empGroupRepository.save(empGroup);
    }
}

