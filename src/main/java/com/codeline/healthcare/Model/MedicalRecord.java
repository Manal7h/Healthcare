package com.codeline.healthcare.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
public class MedicalRecord extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer medicalRecordId;
    //String patient;
    //String doctor;
    //String prescription;
    //String hospitalName;

    @OneToMany
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    Patient patients;

    @ManyToOne
    @JoinColumn(name = "doctors_id", referencedColumnName = "id")
    Doctor doctors;

    @ManyToOne
    @JoinColumn(name = "prescription_id", referencedColumnName = "id")
    Prescription prescriptions;

    @ManyToOne
    @JoinColumn(name = "hospital_id", referencedColumnName = "id")
    Hospital hospitals;

    String referredHospitalName;
}
