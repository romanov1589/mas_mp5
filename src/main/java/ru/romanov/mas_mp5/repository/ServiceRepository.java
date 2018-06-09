package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.romanov.mas_mp5.model.inheritance.disjoint.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
