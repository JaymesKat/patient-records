package edu.miu.jkatarikawe.medicalcenter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo extends JpaRepository <Patient, Long> {

    @Query("SELECT p FROM Patient p")
    public List<Patient> findElderly();
}
