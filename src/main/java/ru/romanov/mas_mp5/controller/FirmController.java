package ru.romanov.mas_mp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.romanov.mas_mp5.model.Address;
import ru.romanov.mas_mp5.model.Firm;
import ru.romanov.mas_mp5.repository.AddressRepository;
import ru.romanov.mas_mp5.repository.FirmRepository;

import java.util.List;

@RestController
public class FirmController {
    @Autowired
    private FirmRepository firmRepository;

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/allfirms")
    public List<Firm> allFirms(){
        List<Firm> firms = firmRepository.findAll();
        return firms;
    }

    @GetMapping(value = "/allfirms/{name}")
    public Firm getFirmByName(@PathVariable("name") String name) {
        return firmRepository.findFirmByName(name);
    }

    @DeleteMapping(value = "/allfirms/{id}")
    public void deleteFirm(@PathVariable("id") Integer id){
        firmRepository.deleteFirmByFirmId(id);
    }

    @PostMapping(value = "/addfirm")
    public void addFirm(@RequestBody @Validated Firm firm) {
        firmRepository.save(firm);
    }

    @PutMapping(value = "firms/{firmId}/{addressId}")
    public void addAddress(@PathVariable("firmId") Integer firmId, @RequestBody @PathVariable("addressId") Integer addressId) {
        Firm firm = firmRepository.findFirmByFirmId(firmId);
        Address address = addressRepository.findAddressByAddressId(addressId);
        firm.setAddress(address);
        firmRepository.save(firm);
    }

}
