package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.romanov.mas_mp5.model.association.withattribute.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
