package com.wilmerbaby.healthcheck;
import jakarta.persistence.*;
import java.io.Serializable;
//@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//GenerationType can cause problems in performance and with database used
    @Column(nullable = false, updatable = false)//parameters on column annotation specify that ID will not allow to be updated
    private long personId;
    private String personFirstName;
    private String personLastName;
    public Person(
            String personFirstNameForm,
            String personLastName,
            long personId
    ){
        this.personId = personId;
        this.personFirstName = personFirstNameForm;
        this.personLastName = personLastName;
    }



    @Override
    public String toString(){
        return "Patient{" +
                "id= " + personId +
                ", name='" + personFirstName + " " + personLastName + '\'' +
              //  ", email='" + personEmail + '\'' +
              //  ", phone='" + cellNumber + '\'' +
              //  ", address='" + personAddress + '\'' +
                '}';
                                }

}
