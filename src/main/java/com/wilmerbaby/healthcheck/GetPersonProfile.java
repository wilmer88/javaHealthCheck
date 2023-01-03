package com.wilmerbaby.healthcheck;

public class GetPersonProfile
{
    String [] getPersonData(String [] person, String[] checkInForm)
    {
        if(person.length == 0)
        {
            System.out.println("person not found");
        }
        return person;
    }
}
