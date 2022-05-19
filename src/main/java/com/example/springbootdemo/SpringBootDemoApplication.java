package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootDemoApplication {
    private final String abc;
    public SpringBootDemoApplication(@Qualifier("myLastName") String abc) {
        this.abc = abc;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @EventListener(ContextRefreshedEvent.class)
    public void bigBikeMethod() {
        System.out.println(abc);
    }

}

