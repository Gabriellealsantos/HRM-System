package com.inovals.HRMSystem.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um cargo no sistema HRM.
 *
 * Contém informações como o título do cargo e uma lista de funcionários associados a esse cargo.
 */
@Entity
@Table(name = "tb_job_title")
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer baseSalary;

    @OneToMany(mappedBy = "jobTitle")
    private List<Employee> employees = new ArrayList<>();

    public JobTitle() {
    }

    public JobTitle(Long id, String name, String description, Integer baseSalary) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.baseSalary = baseSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
