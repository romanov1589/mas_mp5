package ru.romanov.mas_mp5.model.association.manytoone;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Department {
    private int deptId;
    @NotNull
    @Size(min = 2, max = 40)
    private String name;
    private Set<Employee> employees = new HashSet<>();

    public Department(int deptId, String name) {
        this.deptId = deptId;
        this.name = name;
    }

    public Department() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "department")
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
