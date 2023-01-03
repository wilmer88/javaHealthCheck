package com.wilmerbaby.healthcheck;

public class checksForExistingPerson
{
    String [] compare(String [] person, String[] checkInForm)
    {
        if(person.length == 0 | checkInForm.length == 0)
        {
            System.out.println("found no matching data for this form");
        }
        else
        {
            System.out.println("found existing profile");
        }
        return person;


    }
}
