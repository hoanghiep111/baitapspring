package com.example.baitapspring.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is start");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stop");
    }
}
