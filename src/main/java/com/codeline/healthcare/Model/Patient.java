package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Data

public class Patient {

    Integer patientId;
    String patientName;
    String dateOfBirth;
    String phoneNumber;
    String address;
    String insurance;
    List<MedicalAppointment> medicalHistory;
}
