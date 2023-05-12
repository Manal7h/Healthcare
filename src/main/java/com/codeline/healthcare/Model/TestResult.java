package com.codeline.healthcare.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TestResult {
    Integer testResultId;
    String testName;
    String orderTestDate;
    String testSummery;
    String status;
    String sampleId;
    String requestedByDepartment;
}
