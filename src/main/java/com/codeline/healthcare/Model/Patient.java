package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Data
@Entity
public class Patient extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
    Integer patientId;
    String patientName;
    String dateOfBirth;
    String phoneNumber;
    String address;

    //String insurance;

    @ManyToOne
    @JoinColumn(name = "insurance_provider_id", referencedColumnName = "id")
    InsuranceProvider insuranceProvider;


    List<MedicalAppointment> medicalHistory;





}
