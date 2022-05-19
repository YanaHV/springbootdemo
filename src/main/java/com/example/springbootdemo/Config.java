package com.example.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class Config {
    @Bean(name = "myCountry")
    public String country() {
        return "Ukraine";
    }
    @Bean()
    @Primary
    public String continent() {
        return "Europe";
    }
}
