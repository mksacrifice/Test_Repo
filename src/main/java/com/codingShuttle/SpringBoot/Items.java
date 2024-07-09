package com.codingShuttle.SpringBoot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
public interface Items {
    void getItems();
}
