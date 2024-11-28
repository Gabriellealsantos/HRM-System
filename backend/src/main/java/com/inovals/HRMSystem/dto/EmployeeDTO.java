package com.inovals.HRMSystem.dto;

import com.inovals.HRMSystem.entities.Employee;

import java.time.LocalDate;

public class EmployeeDTO {

    private Long id;
    private String name;
    private LocalDate dateAdmission;
    private Integer salary;

    private JobTitleDTO jobTitleDTO;
    private DepartmentDTO departmentDTO;

    public EmployeeDTO(Long id, String name, LocalDate dateAdmission, Integer salary, JobTitleDTO jobTitleDTO, DepartmentDTO departmentDTO) {
        this.id = id;
        this.name = name;
        this.dateAdmission = dateAdmission;
        this.salary = salary;
        this.jobTitleDTO = jobTitleDTO;
        this.departmentDTO = departmentDTO;
    }

    public EmployeeDTO(Employee entity) {
        // Chama o construtor anterior
        this(entity.getId(), entity.getName(), entity.getDateAdmission(), entity.getSalary(),
                new JobTitleDTO(entity.getJobTitle()), new DepartmentDTO(entity.getDepartment()));
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public LocalDate getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(LocalDate dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public JobTitleDTO getJobTitleDTO() {
        return jobTitleDTO;
    }

    public void setJobTitleDTO(JobTitleDTO jobTitleDTO) {
        this.jobTitleDTO = jobTitleDTO;
    }

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }
}
