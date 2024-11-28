package com.inovals.HRMSystem.dto;

import com.inovals.HRMSystem.entities.Department;

public class DepartmentDTO {


    private Long id;
    private String name;
    private String description;
    private String headDepartment;

    public DepartmentDTO(Long id, String name, String description, String headDepartment) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.headDepartment = headDepartment;
    }

    public DepartmentDTO(Department entity) {
        // Chama o construtor anterior
        this(entity.getId(), entity.getName(), entity.getDescription(), entity.getHeadDepartment());
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeadDepartment() {
        return headDepartment;
    }

    public void setHeadDepartment(String headDepartment) {
        this.headDepartment = headDepartment;
    }

}
