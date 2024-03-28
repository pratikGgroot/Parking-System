package com.project.parkingsystem.parkingservice.parking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @PostMapping("/parking")
    public ResponseEntity<?> parking(@RequestBody ParkingRequest request) {
        ParkingResponse response = parkingService.parkVehicle( request );
        if (response.getMessage() != null) {
            return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( response );
        }
        return ResponseEntity.ok( response );
    }

}
