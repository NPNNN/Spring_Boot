package com.nk.Spring_Boot.bean;
import org.springframework.stereotype.Component;

@Component
public class Diesel implements IEngine{

    Diesel(){
        System.out.println("Diesel class started....");
    }
    public void start()
    {

        System.out.println("Diesel Car Started....");
    }

}
