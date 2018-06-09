package ru.romanov.mas_mp5.controller.association.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.association.manytomany.Route;
import ru.romanov.mas_mp5.repository.RouteRepository;

import java.util.List;

@RestController
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;

    @GetMapping("/routes")
    public List<Route> getAllRoutes(){
        return routeRepository.findAll();
    }
}
