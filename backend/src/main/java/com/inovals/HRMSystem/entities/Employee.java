package com.inovals.HRMSystem.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um funcionário no sistema HRM.
 *
 * Contém informações pessoais, como nome e salário,
 * além de relacionamentos com registros de trabalho, documentos e férias.
 */
@Entity
@Table(name = "tb_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate dateAdmission;

    private Integer salary;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<WorkRecord> workRecords = new ArrayList<>();


    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Document> documents = new ArrayList<>();

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vocation> vocations = new ArrayList<>();

    public Employee() {
    }

    public Employee(Long id, String name, LocalDate dateAdmission, Integer salary) {
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

    public LocalDate getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(LocalDate dateAdmission) {
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

    public List<Document> getDocuments() {
        return documents;
    }

}
