package com.codingShuttle.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

//	Trees tr1;
//	Trees tr2;
//	Application(Trees tr){
//		this.tr1 = tr;
//	}

	@Autowired
	TreesService tr ;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
//		System.out.println(tr1.getTree());
//		System.out.println(tr1.hashCode());
//		System.out.println(tr2.hashCode());
		tr.getData();

	}
}
