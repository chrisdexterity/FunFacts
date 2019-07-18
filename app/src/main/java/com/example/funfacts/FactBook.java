package com.example.funfacts;

import java.util.Random;

public class FactBook {
   private String[] mFacts ={"the hair grows every single fortnight",
            "human heart increases in heartbeat evrytime they run",
            "when a human dies their brain becomes the only organ that dies the last",
            "charles babbage is the father of all computers",
            "age is the only thing that goes up and never comes down",
            "nightfall is what falls and never breaks while daybreak is" +
                    " what breaks and never falls",
            "a baby is bone with 300 bones but by the time they " +
                    "are adults they only have 206 bones"};

    public String getfact(){

        String fact="";
        //randomly select a fact
        Random randomgenerator=new Random();
        int randomnumber=randomgenerator.nextInt(mFacts.length);
        fact= mFacts[randomnumber];
        return fact;
    }

}
