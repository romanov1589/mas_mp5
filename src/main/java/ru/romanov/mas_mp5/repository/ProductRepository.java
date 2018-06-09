package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.inheritance.disjoint.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
