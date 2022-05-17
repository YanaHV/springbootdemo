package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Transmission implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("Додаємо коробку передач...");
    }
}
