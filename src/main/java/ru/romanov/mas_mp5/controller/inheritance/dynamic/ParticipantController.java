package ru.romanov.mas_mp5.controller.inheritance.dynamic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.inheritance.dynamic.Participant;
import ru.romanov.mas_mp5.repository.ParticipantRepository;

import java.util.List;

@RestController
public class ParticipantController {

    @Autowired
    private ParticipantRepository participantRepository;

    @GetMapping("/participants")
    public List<Participant> getAllParticipants(){
        return participantRepository.findAll();
    }
}
