package com.wilmerbaby.healthcheck;

public class ExpectedWaitTime
{

   int calculateWaitTime(String[] waitingListArray)
   {
       int waitTime = waitingListArray.length * 20;
       System.out.println("minutes of wait time: " + waitTime);
       return waitTime;
   }

}
