package com.inovals.HRMSystem.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date dateAdmission;
    private Integer salary;

    @OneToMany(mappedBy = "employee")
    private List<WorkRecord> workRecords = new ArrayList<>();


    public Employee() {
    }

    public Employee(Long id, String name, Date dateAdmission, Integer salary) {
        this.id = id;
        this.name = name;
        this.dateAdmission = dateAdmission;
        this.salary = salary;
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

    public Date getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<WorkRecord> getWorkRecords() {
        return workRecords;
    }
}
