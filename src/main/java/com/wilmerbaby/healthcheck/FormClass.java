package com.wilmerbaby.healthcheck;

public class FormClass {
    private String formType;
    private String firstNameForm;
    private String lastNameForm;

    void FormClassConstructor(String formType, String firstNameForm, String lastNameForm)
    {

        this.formType = formType;
        this.firstNameForm = firstNameForm;
        this.lastNameForm = lastNameForm;
        System.out.println( "created constructor");

    }



}
