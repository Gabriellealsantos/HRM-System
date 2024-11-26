package com.inovals.HRMSystem.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um registro de trabalho de um funcionário no sistema HRM.
 * <p>
 * Contém informações sobre horas trabalhadas, datas e o funcionário relacionado.
 */
@Entity
@Table(name = "tb_work_record")
public class WorkRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate workDate;
    private LocalTime entryTime;
    private LocalTime exitTime;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToMany(mappedBy = "workRecord")
    private List<Foul> fouls = new ArrayList<>();

    // Construtor vazio
    public WorkRecord() {
    }

    // Construtor com parâmetros
    public WorkRecord(Long id, LocalDate workDate, LocalTime entryTime, LocalTime exitTime) {
        this.id = id;
        this.workDate = workDate;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    // Getters e Setters para os campos persistentes
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getWorkDate() {
        return workDate;
    }

    public void setWorkDate(LocalDate workDate) {
        this.workDate = workDate;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalTime exitTime) {
        this.exitTime = exitTime;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Foul> getFouls() {
        return fouls;
    }
}
