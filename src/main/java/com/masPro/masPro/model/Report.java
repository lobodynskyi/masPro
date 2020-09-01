package com.masPro.masPro.model;


import javax.persistence.*;

@Entity
@Table(name="raport")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="klientHistory")
    private String klientHistory;
    @Column(name="medicalReport")
    private String medicalReport;

    @OneToOne
    private Consultation consultation;

    public Report() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKlientHistory() {
        return klientHistory;
    }

    public void setKlientHistory(String klientHistory) {
        this.klientHistory = klientHistory;
    }

    public String getMedicalReport() {
        return medicalReport;
    }

    public void setMedicalReport(String medicalReport) {
        this.medicalReport = medicalReport;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}



