package com.budget.management.system.Budgetmanagementsystem.models;
import javax.persistence.*;

@Entity
@Table(name = "employer_group")
public class EmpGroup {
    @Id
    @GeneratedValue (generator = "emp_group_id")

    @Column(name = "emp_group_id")
    private int groupId;

    @ManyToOne
    @JoinColumn(name = "employers_id")
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    // Constructors, getters, and setters

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}

