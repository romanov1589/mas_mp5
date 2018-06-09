package ru.romanov.mas_mp5.model.association.withattribute;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {
    private int subjectId;
    @NotNull
    @Size(min = 2, max = 40)
    private String subjectName;
    private Set<Schedule> subjectSchedules = new HashSet<>();

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @OneToMany(mappedBy = "subject")
    public Set<Schedule> getSubjectSchedules() {
        return subjectSchedules;
    }

    public void setSubjectSchedules(Set<Schedule> subjectSchedules) {
        this.subjectSchedules = subjectSchedules;
    }
}
