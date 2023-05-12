package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;



@Getter
@Setter
@Data

public class Hospital {

    Integer hospitalId;

    String hospitalName;

    String hospitalLocation;

    String hospitalPhone;

    List<Doctor> doctors;
    List<InsuranceProvider> approvedInsuranceProviders;
}
