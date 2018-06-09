package ru.romanov.mas_mp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.romanov.mas_mp5.model.association.withattribute.Schedule;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

    @Query("SELECT sch.scheduleDate, std.firstName, std.lastName, std.studentIndex, sub.subjectName" +
            " from Schedule sch INNER JOIN sch.student std INNER JOIN sch.subject sub")
    List<Schedule> findAllSchedulesInnerJoinStudentAndSubject();
}
