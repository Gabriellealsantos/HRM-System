package com.inovals.HRMSystem.dto;

import com.inovals.HRMSystem.entities.Foul;
import com.inovals.HRMSystem.entities.enums.FoulReason;

import java.time.LocalDateTime;

public class FoulDTO {


    private Long id;
    private FoulReason reason;
    private String description;
    private LocalDateTime time;

    private WorkRecordDTO workRecordDTO;

    public FoulDTO(Long id, FoulReason reason, String description, LocalDateTime time, WorkRecordDTO workRecordDTO) {
        this.id = id;
        this.reason = reason;
        this.description = description;
        this.time = time;
        this.workRecordDTO = workRecordDTO;
    }

    public FoulDTO(Foul entity) {
        // Chama o construtor anterior
        this(entity.getId(), entity.getReason(), entity.getDescription(), entity.getTime(), new WorkRecordDTO(entity.getWorkRecord()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FoulReason getReason() {
        return reason;
    }

    public void setReason(FoulReason reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public WorkRecordDTO getWorkRecordDTO() {
        return workRecordDTO;
    }

    public void setWorkRecordDTO(WorkRecordDTO workRecordDTO) {
        this.workRecordDTO = workRecordDTO;
    }
}
