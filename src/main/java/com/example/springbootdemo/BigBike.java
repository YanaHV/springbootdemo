package com.example.springbootdemo;

public class BigBike {
    void allDependents(){
        Brakes brakes = new Brakes();
        brakes.createBigBike();
        Frame frame = new Frame();
        frame.createBigBike();
        Pedal pedal = new Pedal();
        pedal.createBigBike();
        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.createBigBike();
        Transmission transmission = new Transmission();
        transmission.createBigBike();
        Wheel wheel = new Wheel();
        wheel.createBigBike();
    }
}
