package com.masPro.masPro.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="idResearch")
    private int idResearch;

    @Column(name="sendRez")
    private int sendRez;

    @Column(name="paymentMethod")
    private int paymentMethod;

    @Column(name="dateOfRes")
    private LocalDateTime dateOfRes;

    @Column(name="status")
    private int status;

    @ManyToOne
    private Client client;

    public Application(int idResearch, int sendRez, int paymentMethod, LocalDateTime dateOfRes, int status, Client client) {
        this.idResearch = idResearch;
        this.sendRez = sendRez;
        this.paymentMethod = paymentMethod;
        this.dateOfRes = dateOfRes;
        this.status = status;
        this.client = client;
    }

    public Application(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdResearch() {
        return idResearch;
    }

    public void setIdResearch(int idResearch) {
        this.idResearch = idResearch;
    }

    public int isSendRez() {
        return sendRez;
    }

    public void setSendRez(int sendRez) {
        this.sendRez = sendRez;
    }

    public int isPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getDateOfRes() {
        return dateOfRes;
    }

    public void setDateOfRes(LocalDateTime dateOfRes) {
        this.dateOfRes = dateOfRes;
    }
}
