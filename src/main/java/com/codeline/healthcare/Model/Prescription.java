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
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer prescriptionId;
    String prescriptionType;
    List<String> medicine;
    String dateOfPrescription;
    String prescribedBy;
    //String hospitalName;

    @ManyToOne
    @JoinColumn(name = "hospital_id", referencedColumnName = "id")
    Hospital hospitals;
}
