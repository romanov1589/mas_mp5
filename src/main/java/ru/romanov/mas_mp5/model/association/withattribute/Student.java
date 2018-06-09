package ru.romanov.mas_mp5.model.association.withattribute;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    private int studentId;
    @NotNull
    @Size(min = 2, max = 40)
    private String firstName;
    @NotNull
    @Size(min = 2, max = 40)
    private String lastName;
    @NotNull
    @Size(min = 2, max = 6)
    private String studentIndex;
    private Set<Schedule> studentSchedules = new HashSet<>();

    public Student(String firstName, String lastName, String index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentIndex = index;
    }

    public Student() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(String studentIndex) {
        this.studentIndex = studentIndex;
    }

    @OneToMany(mappedBy = "student")
    public Set<Schedule> getStudentSchedules() {
        return studentSchedules;
    }

    public void setStudentSchedules(Set<Schedule> studentSchedules) {
        this.studentSchedules = studentSchedules;
    }
}
