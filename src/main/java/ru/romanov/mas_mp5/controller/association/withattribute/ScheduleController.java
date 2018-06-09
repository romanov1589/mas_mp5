package ru.romanov.mas_mp5.controller.association.withattribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.mas_mp5.model.association.withattribute.Schedule;
import ru.romanov.mas_mp5.repository.ScheduleRepository;

import java.util.List;

@RestController
public class ScheduleController {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @GetMapping("/schedule")
    public List<Schedule> getAll(){
        return scheduleRepository.findAllSchedulesInnerJoinStudentAndSubject();
    }
}
