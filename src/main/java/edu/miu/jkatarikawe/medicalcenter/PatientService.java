package edu.miu.jkatarikawe.medicalcenter;

import java.util.Collection;
import java.util.List;

public interface PatientService {
    public List<Patient> findAll();
    public List<Patient> findElderly();
}
