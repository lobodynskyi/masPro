package com.masPro.masPro.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


@Entity(name = "medicalConsultant")
@DiscriminatorValue(value = "medicalConsultant")
public class MedicalConsultant extends Worker {

    @Column(name="diploma")
    private String diploma;


    @OneToMany(
            mappedBy = "medicalConsultant",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<MedicalConsultant_Consultation> consultations;

    public MedicalConsultant(String name, String lastName, int phoneNr, String email, String pasel, LocalDate birthday, LocalDate dateEmployment, float salary, float minSalary, String diploma) {
        super(name, lastName, phoneNr, email, pasel, birthday, dateEmployment, salary, minSalary);
        this.diploma = diploma;
        consultations = new LinkedList<>();
    }

    public MedicalConsultant() {
    }

    public List<MedicalConsultant_Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<MedicalConsultant_Consultation> consultations) {
        this.consultations = consultations;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
}




