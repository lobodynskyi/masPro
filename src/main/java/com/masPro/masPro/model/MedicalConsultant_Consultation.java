package com.masPro.masPro.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="medicalConsultant_Consultation")
public class MedicalConsultant_Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="date")
    private LocalDate date;
    @Column(name="room")
    private int room;
    @ManyToOne
    private Consultation consultation;
    @ManyToOne
    private MedicalConsultant medicalConsultant;

    public MedicalConsultant_Consultation() {
    }

    public MedicalConsultant_Consultation(LocalDate date, int room, Consultation consultation, MedicalConsultant medicalConsultant) {
        this.date = date;
        this.room = room;
        this.consultation = consultation;
        this.medicalConsultant = medicalConsultant;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public MedicalConsultant getMedicalConsultant() {
        return medicalConsultant;
    }

    public void setMedicalConsultant(MedicalConsultant medicalConsultant) {
        this.medicalConsultant = medicalConsultant;
    }
}



