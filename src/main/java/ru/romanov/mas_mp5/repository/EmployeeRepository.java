package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.romanov.mas_mp5.model.association.manytoone.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
