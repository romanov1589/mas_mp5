package ru.romanov.mas_mp5.controller.association.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.association.manytoone.Department;
import ru.romanov.mas_mp5.repository.DepartmentRepository;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
}
