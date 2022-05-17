package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Brakes implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("Створення велосипеда...");
    }
}
