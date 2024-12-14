package com.nk.Spring_Boot.bean;


import org.springframework.stereotype.Component;

@Component
public class Petrol implements IEngine {

    Petrol(){
        System.out.println("Petrol class started....");
    }

    public void start()
    {

        System.out.println("Petrol Car  Started....");
    }
}
