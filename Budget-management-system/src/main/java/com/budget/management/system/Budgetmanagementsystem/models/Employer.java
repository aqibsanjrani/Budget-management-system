package com.budget.management.system.Budgetmanagementsystem.models;

import javax.persistence.*;

@Entity
@Table(name = "usersbudget")
public class Employer {
    @Id
    @GeneratedValue(generator = "employers_id")

    private Long employers_id;
    private String username;

    private String password;
    private String designation;

    public Long getEmployers_id() {
        return employers_id;
    }

    public void setEmployers_id(Long employers_id) {
        this.employers_id = employers_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}
