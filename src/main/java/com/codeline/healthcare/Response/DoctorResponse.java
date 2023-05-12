package com.codeline.healthcare.Response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class DoctorResponse {
    Integer id;

    String name;

    String email;

    String department;

    String specialization;
}
