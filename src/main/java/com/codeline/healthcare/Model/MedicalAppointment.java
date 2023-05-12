package com.codeline.healthcare.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MedicalAppointment {

    Integer medicalAppointmentId;
    String medicalAppointmentDate;
    String medicalAppointmentTime;
    String doctorName;
    String patientName;
    String prescription;
}
