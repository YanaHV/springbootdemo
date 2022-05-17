package com.example.springbootdemo;

import com.example.springbootdemo.CreateBigBike;

public class SteeringWheel implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("Додаємо руль...");
    }
}
