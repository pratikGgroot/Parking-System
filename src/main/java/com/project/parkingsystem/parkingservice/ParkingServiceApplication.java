package com.project.parkingsystem.parkingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run( ParkingServiceApplication.class, args );
        System.out.println( "Initializing Parking Protocol..." );

    }

}