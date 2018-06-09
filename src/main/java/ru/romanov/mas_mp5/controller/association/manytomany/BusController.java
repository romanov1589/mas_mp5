package ru.romanov.mas_mp5.controller.association.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.association.manytomany.Bus;
import ru.romanov.mas_mp5.repository.BusRepository;

import java.util.List;

@RestController
public class BusController {

    @Autowired
    private BusRepository busRepository;

    @GetMapping("/buses")
    public List<Bus> getAllBuses(){
        return busRepository.findAll();
    }
}
