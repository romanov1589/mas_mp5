package ru.romanov.mas_mp5.model.association.withattribute;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Schedule {
    private int scheduleId;
    @NotNull
    private Date scheduleDate;
    private Student student;
    private Subject subject;

    public Schedule(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Schedule(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    @ManyToOne
    @JoinColumn(name = "fk_student")
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "fk_subject")
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
