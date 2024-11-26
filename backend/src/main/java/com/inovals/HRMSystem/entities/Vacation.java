package com.inovals.HRMSystem.entities;

import com.inovals.HRMSystem.entities.enums.VocationStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Representa um período de férias de um funcionário no sistema HRM.
 *
 * Contém informações como data de início, data de término e status das férias.
 */
@Entity
@Table(name = "tb_vacation")
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    // Usar EnumType.STRING ajuda a persistir os valores do enum de maneira mais legível e consistente
    private VocationStatus status;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Vacation() {
    }

    public Vacation(Long id, LocalDate startDate, LocalDate endDate, VocationStatus status, Employee employee) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.employee = employee;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
