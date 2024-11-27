package com.inovals.HRMSystem.dto;

import com.inovals.HRMSystem.entities.Document;
import com.inovals.HRMSystem.entities.Employee;
import com.inovals.HRMSystem.entities.Vacation;
import com.inovals.HRMSystem.entities.WorkRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDTO {

    private Long id;
    private String name;
    private LocalDate dateAdmission;
    private Integer salary;

    private List<WorkRecordDTO> workRecordDTOS;
    private List<DocumentDTO> documentDTOS;
    private List<VacationDTO> vacationDTOS;

    private JobTitleDTO jobTitleDTO;
    private DepartmentDTO departmentDTO;

    public EmployeeDTO(Long id, String name, LocalDate dateAdmission, Integer salary, JobTitleDTO jobTitleDTO, DepartmentDTO departmentDTO) {
        this.id = id;
        this.name = name;
        this.dateAdmission = dateAdmission;
        this.salary = salary;
        this.jobTitleDTO = jobTitleDTO;
        this.departmentDTO = departmentDTO;
        this.workRecordDTOS = new ArrayList<>();
        this.documentDTOS = new ArrayList<>();
        this.vacationDTOS = new ArrayList<>();
    }

    public EmployeeDTO(Employee entity) {
        // Chama o construtor anterior
        this(entity.getId(), entity.getName(), entity.getDateAdmission(), entity.getSalary(),
                new JobTitleDTO(entity.getJobTitle()), new DepartmentDTO(entity.getDepartment()));

        // Preenche as listas
        for (WorkRecord workRecord : entity.getWorkRecords()) {
            workRecordDTOS.add(new WorkRecordDTO(workRecord));
        }
        for (Document document : entity.getDocuments()) {
            documentDTOS.add(new DocumentDTO(document));
        }
        for (Vacation vacation : entity.getVacations()) {
            vacationDTOS.add(new VacationDTO(vacation));
        }
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

    public List<WorkRecordDTO> getWorkRecordDTOS() {
        return Collections.unmodifiableList(workRecordDTOS);
    }

    public List<DocumentDTO> getDocumentDTOS() {
        return Collections.unmodifiableList(documentDTOS);
    }

    public List<VacationDTO> getVacationDTOS() {
        return Collections.unmodifiableList(vacationDTOS);
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
