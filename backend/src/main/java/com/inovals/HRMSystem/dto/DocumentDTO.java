package com.inovals.HRMSystem.dto;

import com.inovals.HRMSystem.entities.Document;

import java.time.LocalDate;

public class DocumentDTO {


    private Long id;
    private String documentName;
    private String documentUrl;
    private LocalDate dateIssuance;

    private EmployeeDTO employeeDTO;

    public DocumentDTO(Long id, String documentName, String documentUrl, LocalDate dateIssuance, EmployeeDTO employeeDTO) {
        this.id = id;
        this.documentName = documentName;
        this.documentUrl = documentUrl;
        this.dateIssuance = dateIssuance;
        this.employeeDTO = employeeDTO;
    }

    public DocumentDTO(Document entity) {
        // Chama o construtor anterior
        this(entity.getId(), entity.getDocumentName(), entity.getDocumentUrl(), entity.getDateIssuance(), new EmployeeDTO(entity.getEmployee()));
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

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public LocalDate getDateIssuance() {
        return dateIssuance;
    }

    public void setDateIssuance(LocalDate dateIssuance) {
        this.dateIssuance = dateIssuance;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }
}
