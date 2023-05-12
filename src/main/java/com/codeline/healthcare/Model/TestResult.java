package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class TestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer testResultId;
    String testName;
    String orderTestDate;
    String testSummery;
    String status;
    String sampleId;
    String requestedByDepartment;
}
