package com.masPro.masPro.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity(name = "pracownik")
@DiscriminatorValue(value = "pracownik")
public abstract class Worker extends Osoba {

    @Column(name="dateEmployment")
    private LocalDate dateEmployment;

    @Column(name="dateDismissal")
    private LocalDate dateDismissal;

    @Column(name="salary")
    private float salary;

    @Column(name="minSalary")
    private float minSalary;

    public Worker() {
    }

    public Worker(String name, String lastName, int phoneNr, String email, String pasel, LocalDate birthday, LocalDate dateEmployment, float salary, float minSalary) {
        super(name, lastName, phoneNr, email, pasel, birthday);
        this.dateEmployment = dateEmployment;
        this.salary = salary;
        this.minSalary = minSalary;
    }

    public LocalDate getDateEmployment() {
        return dateEmployment;
    }

    public void setDateEmployment(LocalDate dateEmployment) {
        this.dateEmployment = dateEmployment;
    }

    public LocalDate getDateDismissal() {
        return dateDismissal;
    }

    public void setDateDismissal(LocalDate dateDismissal) {
        this.dateDismissal = dateDismissal;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(float minSalary) {
        this.minSalary = minSalary;
    }
}
