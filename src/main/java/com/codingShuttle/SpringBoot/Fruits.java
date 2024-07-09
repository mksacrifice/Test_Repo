package com.codingShuttle.SpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env" , havingValue = "fruits")
class Fruits implements Items{

    public void getItems(){
        System.out.println("Take your fruit");
    }
}



