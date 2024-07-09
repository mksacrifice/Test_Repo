package com.codingShuttle.SpringBoot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    Anniversary getAnniversary(){
        return new Anniversary();
    }

    @Bean
    @Scope("prototype")
    Birthday getBirthday(){
        return new Birthday();
    }

//    @Bean
//    Trees getTree(){
//        return new Trees();
//    }
}
