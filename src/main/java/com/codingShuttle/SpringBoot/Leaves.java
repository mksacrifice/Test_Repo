package com.codingShuttle.SpringBoot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env" , havingValue = "Leaves")
public class Leaves implements Items {

    public void getItems() {
        System.out.println("Providing Leaves");
    }

}
