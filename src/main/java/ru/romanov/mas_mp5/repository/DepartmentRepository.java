package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.romanov.mas_mp5.model.association.manytoone.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
