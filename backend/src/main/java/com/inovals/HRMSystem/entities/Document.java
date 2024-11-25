package com.inovals.HRMSystem.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Representa um documento associado a um funcionário no sistema HRM.
 *
 * Contém informações como tipo, URL, data de emissão e o funcionário relacionado.
 */
@Entity
@Table(name = "tb_document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String url;
    private LocalDate dateIssuance;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Document() {
    }

    public Document(Long id, String type, String url, LocalDate dateIssuance, Employee employee) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.dateIssuance = dateIssuance;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDateIssuance() {
        return dateIssuance;
    }

    public void setDateIssuance(LocalDate dateIssuance) {
        this.dateIssuance = dateIssuance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
