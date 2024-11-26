package com.inovals.HRMSystem.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String headDepartment;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(Long id, String name, String description, String headDepartment) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.headDepartment = headDepartment;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeadDepartment() {
        return headDepartment;
    }

    public void setHeadDepartment(String headDepartment) {
        this.headDepartment = headDepartment;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
