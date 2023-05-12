package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Data
@Entity
public class InsuranceProvider extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    String InsuranceProviderName;
    String InsuranceType;
    String coverageType;
    String InsuranceProviderPhone;

   // List<Patient> patients;

    @OneToMany
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    Patient patients;

}
