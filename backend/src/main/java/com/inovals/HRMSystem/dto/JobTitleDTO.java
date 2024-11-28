package com.inovals.HRMSystem.dto;

import com.inovals.HRMSystem.entities.JobTitle;

public class JobTitleDTO {

    private Long id;
    private String name;
    private String description;
    private Integer baseSalary;

    public JobTitleDTO(Long id, String name, String description, Integer baseSalary) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.baseSalary = baseSalary;
    }

    public JobTitleDTO(JobTitle entity) {
        // Chama o construtor anterior
        this(entity.getId(), entity.getName(), entity.getDescription(), entity.getBaseSalary());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
