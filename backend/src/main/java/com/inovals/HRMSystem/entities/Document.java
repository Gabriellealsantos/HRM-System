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
    private String documentName;
    private String documentUrl;
    private LocalDate dateIssuance;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Document() {
    }

    public Document(Long id, String documentName, String documentUrl, LocalDate dateIssuance, Employee employee) {
        this.id = id;
        this.documentName = documentName;
        this.documentUrl = documentUrl;
        this.dateIssuance = dateIssuance;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public LocalDate getDateIssuance() {
        return dateIssuance;
    }

    public void setDateIssuance(LocalDate dateIssuance) {
        this.dateIssuance = dateIssuance;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = this.documentUrl;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
