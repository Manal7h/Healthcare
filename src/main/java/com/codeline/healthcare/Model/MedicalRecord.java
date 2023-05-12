package com.codeline.healthcare.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MedicalRecord {

    Integer id;
    String patient;
    String doctor;
    String prescription;
    String hospitalName;
    String referredHospitalName;
}
