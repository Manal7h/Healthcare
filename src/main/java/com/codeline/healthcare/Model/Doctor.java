package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Data

public class Doctor extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "id")

    Integer doctorId;

    String doctorName;

    String doctorEmail;

    String doctorDepartment;

    String doctorSpecialization;
}
