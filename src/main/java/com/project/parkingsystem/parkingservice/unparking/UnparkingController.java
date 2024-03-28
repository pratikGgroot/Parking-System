package com.project.parkingsystem.parkingservice.unparking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/unparking")
public class UnparkingController {

    @Autowired
    private UnparkingService unparkingService;

    @PutMapping
    public ResponseEntity<UnparkingResponse> unparkVehicle(@RequestBody UnparkingRequest request) {
        UnparkingResponse response = unparkingService.unparkVehicle( request );
        return new ResponseEntity<>( response, HttpStatus.OK );
    }
}

