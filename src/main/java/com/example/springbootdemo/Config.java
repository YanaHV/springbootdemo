package com.example.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String name() {
        return "Yana";
    }

    @Bean(name = "myLastName")
    public String lastName() {
        return "Hvozdetska";
    }

}
