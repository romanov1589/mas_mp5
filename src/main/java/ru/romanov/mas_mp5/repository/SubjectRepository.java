package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.romanov.mas_mp5.model.association.withattribute.Subject;

import javax.persistence.Entity;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
