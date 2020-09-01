package com.masPro.masPro.model;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;


@Entity
@Table(name="consultation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="topic")
    private String topic;
    @Column(name="price")
    private int price;

    @ManyToOne
    private Client client;

    @OneToOne
    private Report report;

    @OneToMany(
            mappedBy = "consultation",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<MedicalConsultant_Consultation> consultationsList;

    public Consultation() {
    }

    public Consultation(String topic, int price, Client client) {
        this.topic = topic;
        this.price = price;
        this.client = client;
        consultationsList = new LinkedList<>();
    }

    public List<MedicalConsultant_Consultation> getConsultationsList() {
        return consultationsList;
    }

    public void setConsultationsList(List<MedicalConsultant_Consultation> consultationsList) {
        this.consultationsList = consultationsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}



