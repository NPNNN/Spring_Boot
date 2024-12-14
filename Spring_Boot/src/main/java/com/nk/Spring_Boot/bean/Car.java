package com.nk.Spring_Boot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

   @Autowired
   IEngine  diesel ;
    public void m1()
    {
        diesel .start();
    }

}
