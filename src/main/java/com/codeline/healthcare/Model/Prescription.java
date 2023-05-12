package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class Prescription {
    Integer prescriptionId;
    String prescriptionType;
    List<String> medicine;
    String dateOfPrescription;
    String prescribedBy;
    String hospitalName;
}
