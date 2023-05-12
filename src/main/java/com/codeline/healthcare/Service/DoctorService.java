package com.codeline.healthcare.Service;

import com.codeline.healthcare.Model.Doctor;
import com.codeline.healthcare.Repository.DoctorRepository;
import com.codeline.healthcare.Request.DoctorRequest;
import com.codeline.healthcare.Response.DoctorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    //1.Create
    public String createDoctor(DoctorRequest request) {
        Doctor doctor = new Doctor();
        doctor.setDoctorName(request.getDoctorName());
        doctor.setDoctorEmail(request.getDoctorEmail());
        doctor.setDoctorDepartment(request.getDoctorDepartment());
        doctor.setDoctorSpecialization(request.getDoctorSpecialization());
        doctorRepository.save(doctor);
        return "Created Successfully";
    }

//    public Doctor getDoctor(DoctorRequest request) {
//        Doctor doctor = doctorRepository.findById(request.getDoctorId()).get();
//        return doctor;
//    }

    public DoctorResponse getDoctorById(DoctorRequest request) {
        Doctor doctor = doctorRepository.findById(request.getDoctorId()).get();
        DoctorResponse doctorResponse = DoctorResponse.convertToResponse(doctor);
        return doctorResponse;
    }

    public void deleteDoctor(DoctorRequest request) {
        Doctor doctor = doctorRepository.findById(request.getDoctorId()).get();
        doctor.setIsActive(false);
        doctor.setUpdatedDate(new Date());
        doctorRepository.save(doctor);
    }


}
