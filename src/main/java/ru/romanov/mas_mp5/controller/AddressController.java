package ru.romanov.mas_mp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.Address;
import ru.romanov.mas_mp5.repository.AddressRepository;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/alladdresses")
    public List<Address> allAddresses(){
        List<Address> addresses = addressRepository.findAll();
        return addresses;
    }
}
