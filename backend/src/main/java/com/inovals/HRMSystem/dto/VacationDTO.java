package com.inovals.HRMSystem.dto;

import com.inovals.HRMSystem.entities.Vacation;
import com.inovals.HRMSystem.entities.enums.VocationStatus;

import java.time.LocalDate;

public class VacationDTO {

    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private VocationStatus status;

    private EmployeeDTO employeeDTO;

    public VacationDTO(Long id, LocalDate startDate, LocalDate endDate, VocationStatus status, EmployeeDTO employeeDTO) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.employeeDTO = employeeDTO;
    }

    public VacationDTO(Vacation entity) {
       this(entity.getId(), entity.getStartDate(), entity.getEndDate(), entity.getStatus(), new EmployeeDTO(entity.getEmployee()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public VocationStatus getStatus() {
        return status;
    }

    public void setStatus(VocationStatus status) {
        this.status = status;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }
}
