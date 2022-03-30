package edu.miu.jkatarikawe.medicalcenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    public PatientRepo patientRepo;

    @Override
    public List<Patient> findAll() {
        return patientRepo.findAll();
    }

    @Override
    public List<Patient> findElderly() {
        return null;
    }
}
