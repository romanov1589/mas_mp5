package ru.romanov.mas_mp5.controller.association.composition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.association.composition.Hotel;
import ru.romanov.mas_mp5.repository.HotelRepository;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/allhotels")
    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();

    }
    @DeleteMapping("/allhotels/{id}")
    public void deleteHoyelById(@PathVariable("id") Integer hotelId){
        hotelRepository.deleteById(hotelId);
    }
}
