package com.wilmerbaby.healthcheck.model;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//GenerationType can cause problems in performance and with database used
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
    private int ssNum;
    private int homePhoneNumber;
    private String cellNumber;
    private String personEmail;
    private String occupation;
    private String employerName;
    private int employerPhoneNumber;
    private String referredBy;
    private String familyMembersSeenHere;
    private String imageUrl;
    public Person(){}
    public Person(String personFirstName, String personLastName, String birthDay,int age, String sex, String personAddress, int ssNum, String cellNumber, String personEmail)
    {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.birthDay = birthDay;
        this.age = age;
        this.sex = sex;
        this.personAddress = personAddress;
        this.ssNum = ssNum;
        this.cellNumber = cellNumber;
        this.personEmail = personEmail;
    }

    public Long getPersonId(){
        return personId;
    }

    public void setPersonId(long personId1){
        this.personId = personId1;
    }

    public String getPersonName(){
        return personFirstName +" "+ personLastName;
    }

    public void setPersonFirstName(String firstName){
        this.personFirstName = firstName;
    }

    public void setPersonLastName(String lastName){
        this.personLastName = lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String dob){
        this.birthDay = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex1){
        this.sex = sex1;
    }

    public String getPersonAddress(){
        return personAddress;
    }

    public void setPersonAddress(String address){
        this.personAddress = address;
    }

    public int getSsNum() {
        return ssNum;
    }

    public void setSsNum(int ssNum1){
        this.ssNum = ssNum1;
    }

    public String getCellNumber(){
        return cellNumber;
    }

    public void setCellNumber(String cellNum){
        this.cellNumber = cellNum;
    }

    public String getPersonEmail(){
        return personEmail;
    }

    public void setPersonEmail(String email){
        this.personEmail= email;
    }

    @Override
    public String toString(){
        return "Patient{" +
                "id= " + personId +
                ", name='" + personFirstName + " " + personLastName + '\'' +
                ", email='" + personEmail + '\'' +
                ", phone='" + cellNumber + '\'' +
                ", address='" + personAddress + '\'' +
                '}';
    }


}
