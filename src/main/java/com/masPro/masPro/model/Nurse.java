package com.masPro.masPro.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;


@Entity(name = "nurse")
@DiscriminatorValue(value = "nurse")
public class Nurse extends Pracownik {

    @Column(name="courses")
    private String courses;

    @Column(name="scheduleLink")
    private String scheduleLink;

    public Nurse(String name, String lastName, int phoneNr, String email, String pasel, LocalDate birthday, LocalDate dateEmployment, float salary, float minSalary, String courses, String scheduleLink) {
        super(name, lastName, phoneNr, email, pasel, birthday, dateEmployment, salary, minSalary);
        this.courses = courses;
        this.scheduleLink = scheduleLink;
    }

    public Nurse() {
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getScheduleLink() {
        return scheduleLink;
    }

    public void setScheduleLink(String scheduleLink) {
        this.scheduleLink = scheduleLink;
    }
}
