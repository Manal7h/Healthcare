package com.codeline.healthcare.Response;

import com.codeline.healthcare.Model.Doctor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class DoctorResponse {
    Integer id;

    String name;

    String email;

    String department;

    String specialization;

    public static DoctorResponse convertToResponse(Doctor request) {
        return DoctorResponse.builder()
                .name(request.getDoctorName())
                .email(request.getDoctorEmail())
                .department(request.getDoctorDepartment())
                .specialization(request.getDoctorSpecialization())
                .build();
    }
}
