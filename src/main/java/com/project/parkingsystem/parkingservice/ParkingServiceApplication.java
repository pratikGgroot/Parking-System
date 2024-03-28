package com.project.parkingsystem.parkingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication
public class ParkingServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run( ParkingServiceApplication.class, args );
        System.out.println( "Initializing Parking Protocol.." );

    }

}