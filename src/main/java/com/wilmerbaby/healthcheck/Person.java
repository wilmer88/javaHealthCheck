package com.wilmerbaby.healthcheck;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//GenerationType can cause problems in performance and with database used
    @Column(name="person_id", nullable = false, updatable = false)//parameters on column annotation specify that ID will not allow to be updated
    private long personId;

    private String personFirstName;
    private String personLastName;

    public Person() {
    }

    public Person(
            String personFirstNameForm,
            String personLastName
    ){

        this.personFirstName = personFirstNameForm;
        this.personLastName = personLastName;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }
    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personFirstName='" + personFirstName + '\'' +
                ", personLastName='" + personLastName + '\'' +
                '}';
    }
}
