package com.masPro.masPro.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "client")
@DiscriminatorValue(value = "client")
public class Client extends Osoba{
    @Column(name="discount")
    private int discount;

    @Column(name="password")
    private String password;

    @Column(name="allergy")
    private String allergy;

    @OneToMany(
            mappedBy = "client",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Consultation> consultList;

    @OneToMany(
            mappedBy = "client",
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    private List<Application> applications = new ArrayList<>();

    @OneToMany(
            mappedBy = "client",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<RezResearch> rezResearchListList;

    public Client() {
    }

    public Client(String name, String lastName, int phoneNr, String email, String pasel, LocalDate birthday, int discount, String password, String allergy) {
        super(name, lastName, phoneNr, email, pasel, birthday);
        this.discount = discount;
        this.password = password;
        this.allergy = allergy;
//        consultList = new LinkedList<>();
//        rezResearchListList = new LinkedList<>();
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public List<Application> getApplications() {
        return applications;
    }

    private void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    @Override
    public String toString() {
        return "Client{" +
                "discount=" + discount +
                ", password='" + password + '\'' +
                ", allergy='" + allergy + '\'' +
                '}';
    }
}
