package ru.romanov.mas_mp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(value = "/")
    public String getIndexPage(){
        return "index";
    }

    @GetMapping(value = "/firms")
    public String getFirmsPage(){
        return "firms";
    }

    @GetMapping(value = "/addfirm")
    public String getAddFirmPage(){
        return "addFirm";
    }

    @GetMapping(value = "/hotels")
    public String getAllHotels(){
        return "hotels";
    }
}
