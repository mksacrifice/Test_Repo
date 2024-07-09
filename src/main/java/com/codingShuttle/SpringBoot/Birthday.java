package com.codingShuttle.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Birthday {

//    @Autowired
//    Anniversary anv1;
//
//    @Autowired
//    Anniversary anv2;

    Birthday(){
        System.out.println("Birthday Constructor Called");
    }


    public String getBirthdayPerson(){
//        System.out.println(anv1.hashCode());
//        System.out.println(anv2.hashCode());
        return "Birthday is on 8 July";
    }
}
