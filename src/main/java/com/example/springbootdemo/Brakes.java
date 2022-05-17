package com.example.springbootdemo;

public class Brakes implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("Створення велосипеда...");
    }
}
