package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.romanov.mas_mp5.model.Firm;

@Repository
public interface FirmRepository extends JpaRepository<Firm, Integer>{
    Firm findFirmByFirmId(Integer id);
    Firm findFirmByName(String name);
    @Transactional
    void deleteFirmByFirmId(Integer id);
}
