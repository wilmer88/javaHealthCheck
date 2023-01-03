package com.wilmerbaby.healthcheck.model;


class checkingIn
{
    void checkPersonIn(String form)
    {
        if(form.length()==0)
        {

            System.out.println("person not saved");
        }
        else
        {

            System.out.println("saved person info");
        }

    }

}
