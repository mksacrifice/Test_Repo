package com.codingShuttle.SpringBoot;


import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Trees {

    private Trees(){
        System.out.println("This is tree constructor");
    }

    public String getTree(){
        return "Tree Name is Loading";
    }

    @PostConstruct
    public void beforeTreesCalled(){
        System.out.println("Tree Name is not Known Yet");
    }

}
