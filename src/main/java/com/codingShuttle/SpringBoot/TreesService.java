package com.codingShuttle.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreesService {

    @Autowired
    Items it ;

    void getData(){
        it.getItems();
    }
}
