package com.codeline.healthcare.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class DoctorRequest {

    Integer doctorId;

    String doctorName;

    String doctorEmail;

    String doctorDepartment;

    String doctorSpecialization;


}
