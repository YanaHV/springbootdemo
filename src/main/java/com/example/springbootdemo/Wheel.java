package com.example.springbootdemo;

import com.example.springbootdemo.CreateBigBike;

public class Wheel implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("Додаємо колеса...");
    }
}
