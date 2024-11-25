package com.inovals.HRMSystem.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um registro de trabalho de um funcionário no sistema HRM.
 *
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
    private Integer overtimeHours;
    private Integer hoursWorked;
    private Integer absences;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToMany(mappedBy = "workRecord")
    private List<Foul> fouls = new ArrayList<>();

    public WorkRecord() {
    }

    public WorkRecord(Long id, LocalDate workDate, LocalTime entryTime, LocalTime exitTime, Integer overtimeHours, Integer hoursWorked, Integer absences, Employee employee) {
        this.id = id;
        this.workDate = workDate;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.overtimeHours = overtimeHours;
        this.hoursWorked = hoursWorked;
        this.absences = absences;
        this.employee = employee;
    }

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

    public Integer getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(Integer overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Integer getAbsences() {
        return absences;
    }

    public void setAbsences(Integer absences) {
        this.absences = absences;
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
