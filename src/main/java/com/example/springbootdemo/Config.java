package com.example.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class Config {
    @Bean(name = "myCountry")
    @Primary
    public String country() {
        return "Ukraine";
    }

    @Bean("myContinent")
    public String continent() {
        return "Europe";
    }
}
