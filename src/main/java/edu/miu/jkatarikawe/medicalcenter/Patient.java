package edu.miu.jkatarikawe.medicalcenter;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * patientId:long, (Primary Key)
 * patientNumber, REQUIRED, Unique (e.g. P1000001, EP1000002, EP1000003 etc.)
 * isAnOutPatient: REQUIRED (values: “Yes” or “No”)
 * fullNames, REQUIRED (e.g. John H. Smith, Ann-Marie Washington, Diego A. Ortiz etc.)
 * emailAddress, OPTIONAL (e.g. jhsmith@globalmail.net, awashington@hcmc.org, etc.)
 * contactPhoneNumber, OPTIONAL (e.g. (641) 001-0012, (641) 002-0034, etc.)
 * dateOfBirth, REQUIRED (e.g. 1959-5-21, 1949-12-3, etc.)
 */

@Entity
@Table(name = "Patient")
@Data
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long patientId;

    private String patientNumber;
    private Boolean isOutPatient;
    private String fullName;
    private String emailAddress;
    private String contactPhoneNumber;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
}
