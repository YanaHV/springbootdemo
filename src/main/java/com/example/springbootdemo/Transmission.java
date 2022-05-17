package com.example.springbootdemo;

public class Transmission implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("Додаємо коробку передач...");
    }
}
