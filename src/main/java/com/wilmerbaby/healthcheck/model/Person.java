package com.wilmerbaby.healthcheck.model;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//GenerationType can cause problems depending on the database used
    @Column(nullable = false, updatable = false)//parameters on column annotation specify that ID will not allow to be updated
    private long personId;
    private String personFirstName;
    private String personLastName;
    private String personMiddleName;
    private String maritalStatus;
    private boolean legalName;
    private String personLegalName;
    private String formerName;
    private String birthDay;
    private int age;
    private String sex;
    private String personAddress;
    private int ss_num;
    private int home_phoneNumber;
    private String cell_phoneNumber;
    private String personEmail;
    private String occupation;
    private String employerName;
    private int employer_PhoneNumber;
    private String referredBy_clinic_or_doctor;
    private String familyMembers_seen_here;
    private String imageUrl;
}
