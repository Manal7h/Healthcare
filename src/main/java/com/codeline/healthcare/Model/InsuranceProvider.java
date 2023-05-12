package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Data
public class InsuranceProvider {

    Integer id;
    String InsuranceProviderName;
    String InsuranceType;
    String coverageType;
    String InsuranceProviderPhone;

    List<Patient> patients;
}
