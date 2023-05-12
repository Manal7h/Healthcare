package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Doctor {

    Integer doctorId;

    String doctorName;

    String doctorEmail;

    String doctorDepartment;

    String doctorSpecialization;
}
