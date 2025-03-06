package com.example.baitapspring;

import com.example.baitapspring.vehicle.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan("com.example.baitapspring")
public class BaiTapSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BaiTapSpringApplication.class, args);

		VehicleService vehicleService = context.getBean(VehicleService.class);
		vehicleService.startVehicle();


	}


}
