package com.wilmerbaby.healthcheck;


class checkingIn
{
    Object[] checkPersonIn(Object[] form)
    {
       Object[] formObj = checkPersonIn(form);
        if(formObj.length==0)
        {
            System.out.println("person not saved");
        }

        else
        {
            System.out.println("saved person info");
        }
        return formObj;

    }

}
