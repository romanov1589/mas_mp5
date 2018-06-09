package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.romanov.mas_mp5.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    Address findAddressByAddressId(Integer id);
}
