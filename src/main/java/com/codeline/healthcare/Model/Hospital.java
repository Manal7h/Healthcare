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
public class Hospital extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer hospitalId;

    String hospitalName;

    String hospitalLocation;

    String hospitalPhone;

    //List<Doctor> doctors;

    //List<InsuranceProvider> approvedInsuranceProviders;

    @OneToMany
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    Doctor doctors;


    @OneToMany
    @JoinColumn(name = "insuranceProvider_id", referencedColumnName = "id")
    InsuranceProvider approvedInsuranceProviders;


}
