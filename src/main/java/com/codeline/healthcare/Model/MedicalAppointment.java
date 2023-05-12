package com.codeline.healthcare.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class MedicalAppointment extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer medicalAppointmentId;
    String medicalAppointmentDate;
    String medicalAppointmentTime;
    //String doctorName;
    //String patientName;
    //String prescription;

    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    Doctor doctors;

    @OneToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    Patient patients;

    @OneToOne
    @JoinColumn(name = "prescription_id", referencedColumnName = "id")
    Prescription prescription;


}
