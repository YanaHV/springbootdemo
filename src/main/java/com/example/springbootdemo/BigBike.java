package com.example.springbootdemo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BigBike {
    private final Brakes brakes;
    private final Frame frame;
    private final Pedal pedal;
    private final SteeringWheel steeringWheel;
    private final Transmission transmission;
    private final Wheel wheel;

    void allDependents() {
        brakes.createBigBike();
        frame.createBigBike();
        pedal.createBigBike();
        steeringWheel.createBigBike();
        transmission.createBigBike();
        wheel.createBigBike();
    }
}
