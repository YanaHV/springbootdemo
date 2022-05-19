package com.example.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
    @Bean
    @Primary
    public String name() {
        return "Yana";
    }

    @Bean(name = "myLastName")
    public String lastName() {
        return "Hvozdetska";
    }

}
