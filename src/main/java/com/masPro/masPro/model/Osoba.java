package com.masPro.masPro.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "osoba")
@Table(name = "osoba")
public abstract class Osoba {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phoneNr")
    private int phoneNr;

    @Column(name = "email")
    private String email;

    @Column(name = "pasel")
    private String pasel;

    @Column(name = "birthday")
    private LocalDate birthday;


    public Osoba(String name, String lastName, int phoneNr, String email, String pasel, LocalDate birthday) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNr = phoneNr;
        this.email = email;
        this.pasel = pasel;
        this.birthday = birthday;
    }

    public Osoba() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(int phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasel() {
        return pasel;
    }

    public void setPasel(String pasel) {
        this.pasel = pasel;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
