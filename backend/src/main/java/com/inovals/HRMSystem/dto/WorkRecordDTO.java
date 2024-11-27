package com.inovals.HRMSystem.dto;


import com.inovals.HRMSystem.entities.Foul;
import com.inovals.HRMSystem.entities.WorkRecord;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkRecordDTO {

    private Long id;
    private LocalDate workDate;
    private LocalTime entryTime;
    private LocalTime exitTime;

    private EmployeeDTO employeeDTO;

    private List<FoulDTO> foulDTOS = new ArrayList<>();

    public WorkRecordDTO(Long id, LocalDate workDate, LocalTime entryTime, LocalTime exitTime, EmployeeDTO employeeDTO) {
        this.id = id;
        this.workDate = workDate;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.employeeDTO = employeeDTO;
    }

    public WorkRecordDTO(WorkRecord entity) {
        // Chama o construtor anterior
        this(entity.getId(), entity.getWorkDate(), entity.getEntryTime(), entity.getExitTime(), new EmployeeDTO(entity.getEmployee()));
        
        // Preenche as listas
        for (Foul foul : entity.getFouls()) {
            foulDTOS.add(new FoulDTO(foul));
        }
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

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public List<FoulDTO> getFoulDTOS() {
        return Collections.unmodifiableList(foulDTOS);
    }

}
