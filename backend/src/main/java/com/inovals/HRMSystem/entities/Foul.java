package com.inovals.HRMSystem.entities;

import com.inovals.HRMSystem.entities.enums.FoulReason;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_foul")
public class Foul {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    // Usar EnumType.STRING ajuda a persistir os valores do enum de maneira mais legível e consistente
    private FoulReason reason;

    @Column(columnDefinition = "TEXT", length = 600)
    private String description;

    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "workRecord_id")
    // Garantir que não será possível criar uma infração sem um registro de trabalho associado
    private WorkRecord workRecord;

    public Foul() {
    }

    public Foul(FoulReason reason, String description, LocalDateTime time, WorkRecord workRecord) {
        this.reason = reason;
        this.description = description;
        this.time = time;
        this.workRecord = workRecord;
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

    public WorkRecord getWorkRecord() {
        return workRecord;
    }

    public void setWorkRecord(WorkRecord workRecord) {
        this.workRecord = workRecord;
    }
}
