package com.wilmerbaby.healthcheck;

public class DeviceCheck
{
    void checkDevice(String [] args)
    {
         String[] peron1 = new String[]{"Wilmer.baby"};
         Object[] secondPerson =  new  Object[]{"Daddy.pop",  2.12, false};

        checksForExistingPerson personObj = new checksForExistingPerson();
        personObj.compare(secondPerson,peron1);
    }
}
