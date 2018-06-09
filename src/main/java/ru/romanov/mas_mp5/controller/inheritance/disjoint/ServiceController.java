package ru.romanov.mas_mp5.controller.inheritance.disjoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.inheritance.disjoint.Service;
import ru.romanov.mas_mp5.repository.ServiceRepository;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private ServiceRepository serviceRepository;

    @GetMapping("/services")
    public List<Service> getAllServices(){
        return serviceRepository.findAll();
    }
}
