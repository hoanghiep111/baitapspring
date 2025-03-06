package com.example.baitapspring.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    public Vehicle vehicle;

    @Autowired
    public VehicleService(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void startVehicle() {
        vehicle.start();
    }
}
